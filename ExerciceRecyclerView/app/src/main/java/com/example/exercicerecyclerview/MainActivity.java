package com.example.exercicerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    BingoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        remplirRecyclerView();


    }

    private void remplirRecyclerView() {

        int min =1;
        int max = 75;
        for (int i = 100; i>0 ; i--) {

            TirageBingo t = new TirageBingo();
            t.NumeroDuTirage = i;
            t.NumeroTiré = new Random().nextInt((max - min) + 1) + min;
            if (t.NumeroTiré>=1 && t.NumeroTiré<=15)
            {
                t.LettreTirée = "B";
            }
            else if (t.NumeroTiré>=16 && t.NumeroTiré<=30)
            {
                t.LettreTirée = "I";
            }
            else if (t.NumeroTiré>=31 && t.NumeroTiré<=45)
            {
                t.LettreTirée = "N";
            }
            else if (t.NumeroTiré>=46 && t.NumeroTiré<=60)
            {
                t.LettreTirée = "G";
            }
            else if (t.NumeroTiré>=61 && t.NumeroTiré<=75)
            {
                t.LettreTirée = "O";
            }

            adapter.listTirageBingo.add(t);




        }

        adapter.notifyDataSetChanged();



    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

       adapter = new BingoAdapter();
        recyclerView.setAdapter(adapter);



    }
}