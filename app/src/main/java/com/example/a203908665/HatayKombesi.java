package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HatayKombesi extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatay_kombesi);

        getSupportActionBar().setTitle("Hatay Künefe");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu11);
        konu.setText("24 birbirinden nefis Hatay yemeği tarifinden sonra Hatay'ın üç meşhur tatlısına yer verelim. Tarife has baharatları, tahta kurabiye ile verilen şekli, bu tarife çok yakışan susamı ile Hatay'ın bayram ikramlığı kömbe çok lezzetli olur.");

    }
}