package com.example.a203908665;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView btnlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Ana Menü");
        btnlistview = findViewById(R.id.view_list);

        final List<String> labels = Arrays.asList("Hatayın Tarihi", "Hatayın Tarihi Yerleri", "Hatayın Yörsel Yemekler", "Hatayın Yörsel Tatlılar");

        tvListAdapter adapter = new tvListAdapter(this, labels, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yeralan = (int) v.getTag();
                String label = labels.get(yeralan);

                switch (yeralan) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, Hatay.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, HatayinTarihiYerleri.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, HatayinYemekleri.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, HatayinTatlileri.class);
                        startActivity(intent3);
                        break;
                }
            }
        });

        btnlistview.setAdapter(adapter);
    }

    private class tvListAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final List<String> labels;
        private final View.OnClickListener btnClickListener;

        public tvListAdapter(MainActivity context, List<String> labels, View.OnClickListener btnClickListener) {
            super(context, -1, labels);
            this.context = context;
            this.labels = labels;
            this.btnClickListener = btnClickListener;
        }

        @Override
        public View getView(int yeralan, View convertView, ViewGroup parent) {
            Button btn;

            if (convertView == null) {
                btn = new Button(context);
                btn.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
            } else {
                btn = (Button) convertView;
            }

            String label = getItem(yeralan);
            btn.setText(label);
            btn.setTag(yeralan);
            btn.setOnClickListener(btnClickListener);

            btn.setTypeface(Typeface.create("sans", Typeface.NORMAL));
            btn.setGravity(Gravity.LEFT);
            btn.setPadding(10,10,10,10);
            btn.setTextSize(34);
            btn.setAllCaps(false);
            btn.setBackgroundColor(Color.rgb(153, 102, 255));
            btn.setTextColor(Color.WHITE);

            return btn;
        }
    }
}