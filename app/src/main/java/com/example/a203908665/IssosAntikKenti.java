package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IssosAntikKenti extends AppCompatActivity {
    TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issos_antik_kenti);

        getSupportActionBar().setTitle("İssos Antik Kenti");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu4);
        konu.setText("Hatay’ın Erzin ilçesinin içerisinde yer alan İssos Antik Kenti, Erzin ilçe merkezine 7, Hatay il merkezine ise yaklaşık olarak 100 kilometre mesafede bulunmaktadır. İl merkezinden kalkan Erzin otobüs ve minibüsleri ile önce Erzin’e ardından da özel taksi veya toplu taşıma yardımı ile İssos Antik Kenti’ne ulaşabilirsiniz.\n" +
                "Erzin’de yer alan İssos Antik Kenti, Roma Antik Dönemi’ne ait bir eser olarak dikkat çekmektedir. M.Ö. 3000 yılına tarihlenen bu yapıda 7 metre yüksekliğe ve yüzlerce metre uzunluğa sahip olan su kemerlerinin bulunduğu bilinmektedir. Bir höyük olarak bölgede yer alan höyük içerisinde müzik odası, amfi tiyatro, tapınaklar ve hamam kalıntıları da yer almaktadır.\n" +
                "Bölgeden pek çok farklı mozaik yapının çıkarıldığı bilinmektedir. Çıkarılan mozaiklerin büyük bir çoğunluğu Hatay Arkeoloji Müzesi’nde sergilenmektedir. Ayrıca bu bölgede tarihin gördüğü büyük savaşlardan biri olan İssos Savaşı’nın gerçekleştiği ve savaşta Makedon Kral Büyük İskender’in Pers Kralı 3. Darius’u yendiği düşünülmektedir.");

    }
}