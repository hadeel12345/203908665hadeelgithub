package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class HatayinTarihiYerleri extends AppCompatActivity {
    Button tikla, tikla1, tikla2, tikla3, tikla4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatayin_tarihi_yerleri);
        getSupportActionBar().setTitle("Hatayın Tarihi Yerleri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tikla = findViewById(R.id.tikla4);
        tikla1 = findViewById(R.id.tikla5);
        tikla2 = findViewById(R.id.tikla6);
        tikla3 = findViewById(R.id.tikla7);
        tikla4 = findViewById(R.id.tikla8);

        tikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HatayinTarihiYerleri.this, HatayArkeolojiMuzesi.class);
                startActivity(intent);
            }
        });

        tikla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HatayinTarihiYerleri.this, StPierreKilisesi.class);
                startActivity(intent1);
            }
        });

        tikla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HatayinTarihiYerleri.this, TitusTuneliVeBesikliMagara.class);
                startActivity(intent2);
            }
        });

        tikla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HatayinTarihiYerleri.this, IssosAntikKenti.class);
                startActivity(intent3);
            }
        });

        tikla4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(HatayinTarihiYerleri.this, PayasKalesi.class);
                startActivity(intent4);
            }
        });
    }
}