package com.example.pretest_if2_10116071;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityMain1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button btn = (Button) findViewById(R.id.button3)  ;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kode = (EditText) findViewById(R.id.editText2);
                String kode1 = kode.getText().toString();
                if(TextUtils.isEmpty(kode1)){
                    kode.setError("Silahkan Masukan Kode Keluarga Terlebih Dahulu");
                } else {
                    startActivity(new Intent(ActivityMain1.this, ActivityMain2.class));
                }
            }
        });
    }
}
