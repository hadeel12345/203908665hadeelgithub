package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KitirKabakTatlisi extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitir_kabak_tatlisi);

        getSupportActionBar().setTitle("Kıtır Kapak Tatlısı");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu12);
        konu.setText("Hatay'da kabak tatlısı şekerleme kıtırlığında kireçte bekletilerek yapılır. Yapım aşamaları diğer kabak tatlılarına göre zahmetli olsa da bizce bir farklılık yapıp bu tarifini de mutlaka denemelisiniz.");

    }
}