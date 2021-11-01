package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    PersonAdapter adapter;
   List<String> listNom = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // remplissage de liste nom
        listNom.add("Laura");
        listNom.add("James");
        listNom.add("Max");
        listNom.add("Alexandre");
        listNom.add("Gerant");
        listNom.add("Paul");
        listNom.add("Melissa");
        listNom.add("Ghiles");
        listNom.add("Amine");
        listNom.add("Johnny");



        initRecyclerView();
        remplirRecyclerview();
    }



    private void remplirRecyclerview() {



        for (int i = 0; i < 100 ; i++) {

            Person p = new Person();
            p.nom = listNom.get(new Random().nextInt(10));
            p.age = 20 + (new Random().nextInt(20));
            adapter.list.add(p);

        }

        adapter.notifyDataSetChanged();



    }

    private void initRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        adapter = new PersonAdapter();
        recyclerView.setAdapter(adapter);



    }
}