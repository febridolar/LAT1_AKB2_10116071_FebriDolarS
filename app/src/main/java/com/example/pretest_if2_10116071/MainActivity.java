package com.example.pretest_if2_10116071;

/*

Febri Dolar S
IF-2

CHANGE LOG

4 April 2019 04.23
- Membuat Layout Tampilan Splash Screen

4 April 2019 08.05
- Membuat Layout Tampilan Kode Keluarga

4 April 2019 13.54
- Membuat Layout Tampilan Input Nama & Umur

4 April 2019 17.25
- Membuat Layout Tampilan Terahkir

6 April 2019 15.11
- Memperbaiki Layout dan Isi Layout

6 April 2019 17.16
- Membuat Validasi dan Fungsi Activity

*/


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button btn = (Button) findViewById(R.id.button)  ;

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this, ActivityMain1.class));
             }
         });
            }




     }

