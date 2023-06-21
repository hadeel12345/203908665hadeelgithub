package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HatayinYemekleri extends AppCompatActivity {
    Button tikla, tikla1, tikla2, tikla3, tikla4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatayin_yemekleri);

        getSupportActionBar().setTitle("Hatayın Yöresel Yemekleri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tikla = findViewById(R.id.tikla9);
        tikla1 = findViewById(R.id.tikla10);
        tikla2 = findViewById(R.id.tikla11);
        tikla3 = findViewById(R.id.tikla12);

        tikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HatayinYemekleri.this, IcliKofte.class);
                startActivity(intent);
            }
        });

        tikla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HatayinYemekleri.this, KaytazBoregi.class);
                startActivity(intent1);
            }
        });

        tikla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HatayinYemekleri.this, Felleahkoftesi.class);
                startActivity(intent2);
            }
        });

        tikla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HatayinYemekleri.this, HatayYoresi.class);
                startActivity(intent3);
            }
        });

    }
}