package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KaytazBoregi extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaytaz_boregi);

        getSupportActionBar().setTitle("Kaytaz Böreği");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu7);
        konu.setText("Adının börek olduğuna bakmayın... Bildiğiniz ana yemektir.... Antakya yöresinin en sevilen yemeklerinden biridir… Hamur işi sevenlerin vazgeçilmezidir… Fındık lahmacuna benzerliği ile de bilinir… Bir kez yapıp, yedikten sonra sofralarınızın vazgeçilmezi haline gelebilir.");

    }
}