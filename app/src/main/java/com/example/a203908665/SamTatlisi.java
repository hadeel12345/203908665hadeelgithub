package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SamTatlisi extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_tatlisi);

        getSupportActionBar().setTitle("Kıtır Kapak Tatlısı");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu13);
        konu.setText("Şambali veya Şam tatlısı, Türk mutfağından irmikli bir tatlıdır. Yoğurt, irmik, un ana malzemeleridir. Karışım yağlanmış tepsiye dökülerek üzerine badem veya yer fıstığı dizilir. Öncelikle üzeri kızarana kadar fırında pişirilir.");

    }
}