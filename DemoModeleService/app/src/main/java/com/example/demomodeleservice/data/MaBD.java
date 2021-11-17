package com.example.demomodeleservice.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.demomodeleservice.modele.Etudiant;
import com.example.demomodeleservice.modele.Examen;

@Database(entities = {Etudiant.class, Examen.class}, version = 1)
public abstract class MaBD extends RoomDatabase {
    public abstract MonDAO dao();
}