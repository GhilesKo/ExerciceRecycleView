package com.example.seance2demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.seance2demo.dao.MaBD;
import com.example.seance2demo.databinding.ActivityMainBinding;
import com.example.seance2demo.modele.DemoSeance;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    List<Date> listEvenement = new ArrayList<>();
    Date tempsEvenement;
    MaBD db;
    List<DemoSeance> listDemoSeance;
    TextView tv;
    String dateDernier;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



       db = Room.databaseBuilder(getApplicationContext(), MaBD.class, "pipo").allowMainThreadQueries().build();
       listDemoSeance  = new ArrayList<>();
       listDemoSeance = db.dao().listSeance();

        if (listDemoSeance.size() == 0)
        {
            Toast.makeText(getApplicationContext(),"Premiere ouverture", Toast.LENGTH_SHORT).show();

        }
        else {
            dateDernier = listDemoSeance.get(listDemoSeance.size()-1).dateSeance.toString();
            binding.txtHeure.setText(dateDernier);

        }
        Log.i("Create", "a ete creer");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tempsEvenement = new Date();
        DemoSeance destroyseance = new DemoSeance();
        destroyseance.dateSeance = tempsEvenement;
        db.dao().insertSeance(destroyseance);



        Log.i("Destroy", "Application destroyed" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        tempsEvenement = new Date();
        DemoSeance destroyseance = new DemoSeance();
        destroyseance.dateSeance = tempsEvenement;
        db.dao().insertSeance(destroyseance);
        dateDernier = listDemoSeance.get(listDemoSeance.size()-1).dateSeance.toString();
        binding.txtHeure.setText(dateDernier);



        Log.i("Stop", "Application stopped" );
    }

    @Override
    protected void onResume() {
        super.onResume();

        dateDernier = listDemoSeance.get(listDemoSeance.size()-1).dateSeance.toString();
        binding.txtHeure.setText(dateDernier);



        Log.i("rESUME", "Application resume" );


    }

    @Override
    protected void onPause() {
        super.onPause();
        tempsEvenement = new Date();
        DemoSeance destroyseance = new DemoSeance();
        destroyseance.dateSeance = tempsEvenement;
        db.dao().insertSeance(destroyseance);
        dateDernier = listDemoSeance.get(listDemoSeance.size()-1).dateSeance.toString();
        binding.txtHeure.setText(dateDernier);



        Log.i("Pause", "Application Paused" );

    }

}