package com.example.ordrealphaexercice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> listNom = new ArrayList<>();
    PersonAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        InitRecyclerView();
        RemplirRecyclerView();

    }



    private void RemplirRecyclerView() {

        listNom.add("Jean");listNom.add("Alain");listNom.add("Paul");listNom.add("John");
        for (int i = 0; i <4 ; i++) {

            Person p = new Person();
            p.nom = listNom.get(i);
            adapter.list.add(p);
        }
        Collections.shuffle(adapter.list);

        adapter.notifyDataSetChanged();

    }

    private void InitRecyclerView() {
       RecyclerView recyclerView = findViewById(R.id.recyclerView);
       recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new PersonAdapter();
        recyclerView.setAdapter(adapter);


    }
}