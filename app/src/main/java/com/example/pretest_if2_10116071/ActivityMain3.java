package com.example.pretest_if2_10116071;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityMain3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv1 = (TextView) findViewById(R.id.textView11);
        TextView tv2 = (TextView) findViewById(R.id.textView17);
        TextView tv3 = (TextView) findViewById(R.id.textView20);
        Intent ambil = getIntent();
        String nama = ((Intent) ambil).getExtras().getString("location");
        tv1.setText(nama);
        tv2.setText(nama);
        tv3.setText(nama);

        Button keluar = (Button) findViewById(R.id.button5)  ;

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
