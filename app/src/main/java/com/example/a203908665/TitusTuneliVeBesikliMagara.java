package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TitusTuneliVeBesikliMagara extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titus_tuneli_ve_besikli_magara);

        getSupportActionBar().setTitle("Titus Tüneli ve Beşikli Mağara");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu3);
        konu.setText("Hatay’ın Samandağ ilçesinde yer alan Titus Tüneli ve Beşikli Mağara, aynı bölge içerisinde yer alan tarihi yapılardır. Bu yerleri gezebilmek adına Hatay il merkezinden Samandağ’a 25 kilometre gitmeniz gerekmektedir. Yolculuğunuzu özel taksi ve toplu taşıma araçları ile kısa sürede gidebilirsiniz.\n" +
                "Titus Tüneli, dünyanın en büyük tünellerinden biridir. 1300 metre uzunluğunda olan bu tünelin yüksekliği ise yaklaşık olarak 7 metredir. Mutlaka görmeniz gereken bir yapı olan Titus Tüneli, Beşikli Mağara ile neredeyse yan yana bulunmaktadır.\n" +
                "Beşikli Mağara ise eski bir Roma mezarlığı olarak dikkat çekmektedir. Çeşitli kaya mezarların bulunduğu bu yerde toplamda 93 adet anıt mezar bulunmuştur. Günümüzde rahatlıkla gezilebilen bu 2 tarihi yer, Hatay tatilinizi daha keyifli bir hale getirmek için ziyaret edebileceğiniz yerlerdendir.");

    }
}