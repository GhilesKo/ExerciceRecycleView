package com.example.demomodeleservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.demomodeleservice.data.MaBD;
import com.example.demomodeleservice.modele.Etudiant;
import com.example.demomodeleservice.modele.Examen;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MaBD bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bd = Room.databaseBuilder(getApplicationContext(),
                MaBD.class, "examenBD").build();
        int random_int = (int)Math.floor(Math.random()*(100-0+1)+0);

        for (int i = 0; i < 30 ; i++) {
            Long nombre = Long.valueOf(random_int);

            Etudiant e = new Etudiant();
            e.prénom = "George";
            e.nom = "Tremblay";

            Examen examen = new Examen();
            examen.noteObtenu = nombre;
            examen.ponderation = Long.valueOf(20);
            examen.titreExamen = "Examen fin session";

            bd.dao().insertExamenEtudiant(e,examen);
        }





    }




}