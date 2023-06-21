package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hatay extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatay);

        getSupportActionBar().setTitle("Hatay Tarihçesi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu);
        konu.setText("Türkiye'nin en eski şehirleri arasında bulunan Hatay, yapılan çalışmalarda elde edilen bilgilere göre M.Ö 100.000 ile 40.000 zamanından beri yaşamın olduğu bir yerdir. Orta paleolitik, Neolotik, Kalkolit dönemlerde ve Tunç Çağı'nda yaygın olarak kullanılan bir yerleşim yeridir. Tunç Çağı'nda Akat beyliği, M.Ö 1800-1600 yılları arasında Yamhad Krallığına bağlı olan Hatay, M.Ö 17. yüzyılda Hititlerin hakimiyetine geçmiştir. Ardından M.Ö. 1490 yılında Mısır hakimiyetine giren Hatay, daha sonraları sırasıyla Urartular, Asurlular ve Perslere ev sahipliği yapmıştır.");

    }
}