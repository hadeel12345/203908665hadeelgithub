package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Felleahkoftesi extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felleahkoftesi);

        getSupportActionBar().setTitle("Felleah köftesi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu8);
        konu.setText("Hatayının en meşhur yemeklerin birisi …………..\n" +
                "İnternette en çok aranan yöresel yemeklerden birisi fellah köftesidir. Kendine has sosu ile inanılmaz güzel bir yemek olur. Yuvarlanan bulgur köftesinin haşlanması ile hazırlanır. Adana, Malatya, Gaziantep ve özellikle Hatay'da sıkça yapılır, yanına bol ekşili salatalar eşliğinde afiyetle yenir.");

    }
}