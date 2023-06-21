package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class HatayKunefe extends AppCompatActivity {
    TextView konu;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatay_kunefe);

        getSupportActionBar().setTitle("Hatay Künefe");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu10);
        konu.setText("Hatay'ın En Meşhur Tatlısı: Hatay denilince elbette ilk akla gelen tatlı çeşidi künefedir. Bununla birlikte listemizde de yer verdiğimiz Antakya kömbesi, haytalı, kerebiç ve kireçte kabak tatlıları Hatay gezilerinde mutlaka tadılan lezzetler arasında yer almaktadır.");

    }
}