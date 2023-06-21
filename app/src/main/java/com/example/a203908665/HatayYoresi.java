package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HatayYoresi extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatay_yoresi);

        getSupportActionBar().setTitle("Hatay Yöresi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu9);
        konu.setText("Etsiz çiğ köfte lezzetini deneyip çok sevenlere Hatay yöresinden bulgurlu patates köftesini önerelim. Baharatlar ve bol salça eşliğinde yoğrulan köfteye haşlanmış patates eklenerek kıvam verilen bir tarifi var. Gün davetlerinde veya akşam yemeklerine aperitif olarak hazırlayıp, herkesi bu lezzete hayran bırakabilirsiniz.");

    }
}