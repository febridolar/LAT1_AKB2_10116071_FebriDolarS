package com.example.pretest_if2_10116071;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityMain2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = (Button) findViewById(R.id.button2)  ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nama = (EditText) findViewById(R.id.editText3);
                EditText umur = (EditText) findViewById(R.id.editText);
                String nama1 = nama.getText().toString();
                String umur1 = nama.getText().toString();
                if(TextUtils.isEmpty(nama1) || TextUtils.isEmpty(umur1)){
                    nama.setError("Masukan Nama Panggilan Kamu");
                    umur.setError("Masukan Umur Kamu");
                } else {
                    EditText kirim = (EditText) findViewById(R.id.editText3);
                    Intent i = new Intent(ActivityMain2.this, ActivityMain3.class);
                    i.putExtra("location", kirim.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}
