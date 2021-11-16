package com.example.demostockage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.example.demostockage.dao.MaBD;
import com.example.demostockage.modele.DemoSeance;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaBD maBD = Room.databaseBuilder(getApplicationContext(), MaBD.class, "pipo")
                .allowMainThreadQueries()
                .build();
        DemoSeance demoSeance = new DemoSeance();

        demoSeance.typeSeance = "onCreate";
        demoSeance.dateSeance = new Date();
        maBD.dao().creerSeance(demoSeance);
        for (DemoSeance s:maBD.dao().listSeance()) {
            Log.i("SEANCE","Type : " + s.typeSeance + " et Date : " + s.dateSeance);
        }
    }




}