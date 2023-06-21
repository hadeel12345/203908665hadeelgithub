package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IcliKofte extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icli_kofte);

        getSupportActionBar().setTitle("İçli Köfte ( oruk )");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu6);
        konu.setText("Hatay'ın meşhur cevizli içli köftesine oruk denir\" diyerek söze başlayalım. Lezzetli mi lezzetli kıymalı harcı, incecik açılmış bulgur köftesi ile insanın hep Hatay'da yaşayası gelir.");

    }
}