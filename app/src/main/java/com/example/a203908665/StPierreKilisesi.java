package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StPierreKilisesi extends AppCompatActivity {
        TextView konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_pierre_kilisesi);

        getSupportActionBar().setTitle("St. Pierre Kilisesi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        konu = (TextView) findViewById(R.id.konu2);
        konu.setText("St. Pierre Kilisesi, Hatay’ın merkezi olan Antakya’da yer alan bir kilisedir. Orijinalinde bir mağara olmasına rağmen yapılan eklemeler ile kiliseye dönüştürülen bu örneği toplu taşıma araçları ve özel taksiler ile kısa sürede ziyaret edebilirsiniz.\n" +
                "St. Pierre Kilisesi, Hristiyanlık alemi için ilk kilise olma özelliğini göstermektedir. Haç Dağı’nda yer alan bu mağarada Hz. İsa’nın havarilerinden biri olan St. Pierre (Aziz Petrus) dini toplantıları mağaranın içerisinde gerçekleştirmiştir. Bu topluluğun “Hristiyan” ismini ilk kez bu mağara içerisinde aldığı bilinmektedir.\n" +
                "Bu kilise, 1963 yılı içerisinde Papa 6. Paul tarafınca Hristiyanlık alemi için Hac yeri olarak ilan edilmiştir. Günümüzde de pek çok ayin ve etkinliğin düzenlendiği bu özel yer içerisinde belli mozaiklerin ve yapıların sergilendiği de bilinmektedir.");

    }
}