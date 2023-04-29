package com.example.podskazka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Винкс");
        list.add("Черепашки ниндзя");
        list.add("My litle pony");
        list.add("Гадкий я");
        list.add("Финес и Ферб");
        list.add("Спанч Боб");
        list.add("Шрек");
        list.add("Скуби-ду");
        list.add("Лило и Стич");
        list.add("Новая школа императора");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(MainActivity.this, VincksActivity.class));


                } else if (i == 1) {
                    startActivity(new Intent(MainActivity.this, NinjaActivity.class));
                } else if (i == 2) {
                    startActivity(new Intent(MainActivity.this, MylitleponyActivity.class));
                } else  if (i == 3){
                    startActivity(new Intent(MainActivity.this, GadkiyJActivity.class));

                }else if (i == 4) {
                    startActivity(new Intent(MainActivity.this, Fines_and_FerbActivity.class));
                } else if (i == 5){
                    startActivity(new Intent(MainActivity.this, Spanh_BobActivity.class));
                } else if (i== 6){
                    startActivity(new Intent(MainActivity.this, ShrekActivity.class));
                } else  if (i==7){
                    startActivity(new Intent(MainActivity.this, Skubi_DuActivity.class));
                } else  if (i==8){
                    startActivity(new Intent(MainActivity.this, Lilo_and_Stich.class));
                } else if (i == 9) {
                    startActivity(new Intent(MainActivity.this, ImperatorActivity.class));
                }
            }
        });

    };
}






