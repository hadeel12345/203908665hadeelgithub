package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PayasKalesi extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payas_kalesi);

        getSupportActionBar().setTitle("Payas Kalesi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu5);
        konu.setText("Payas ilçesinde yer alan Payas Kalesi, Sokullu Mehmet Paşa Külliyesi’nin yanında, deniz kenarına son derece yakın bir konumda bulunmaktadır. İl merkezine yaklaşık olarak 80 kilometre mesafede yer alan bu kaleye gitmek için merkezden kalkan Payas minibüslerine binebilirsiniz.\n" +
                "Payas ilçe merkezinde bulunan Payas Kalesi, Cenevizliler tarafından liman bölgesini korumak amacı ile yaptırılmış bir tarihi yapıdır. 1567 yılında Osmanlı Devleti tarafından bulunduğu yere tekrar inşa edilen Payas Kalesi’nin 8 kulesi bulunmaktadır.");

    }
}