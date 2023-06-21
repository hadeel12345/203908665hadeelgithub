package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HatayArkeolojiMuzesi extends AppCompatActivity {
TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatay_arkeoloji_muzesi);

        getSupportActionBar().setTitle("Hatay Arkeoloji Müzesi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu1);
        konu.setText("Hatay’ın merkezinde yer alan ve en ilgi çekici tarihi yerlerden biri olan Hatay Arkeoloji Müzesi, görmek isteyebileceğiniz bir tarihi yerdir. Antakya’ya giden tüm toplu taşıma araçları ve özel taksiler ile birlikte sorunsuzca müzeyi ziyaret edebilirsiniz.\n" +
                "Hatay Arkeoloji Müzesi, Türkiye’nin en büyük mozaik müzesi olma özelliğini taşımaktadır. Paleolitik ve Neolitik çağdan Roma ve Osmanlı dönemlerine kadar binlerce yıllık mozaiklerin sergilendiği bu müzede mozaikler toplam 3250 metrekare alanı kaplamaktadır.\n" +
                "Hatay Arkeoloji Müzesi, aynı zamanda mozaiklerin kapladıkları alan düşünüldüğünde de dünyanın en bu alanda en büyük müzesi olarak da dikkat çekmektedir. Hatay’ın başta Antakya olmak üzere Erzin, Dörtyol ve Samandağ gibi ilçelerinden çıkartılan mozaikler, müze içerisinde sergilenmektedir.");
    }
}