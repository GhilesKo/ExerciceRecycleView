package com.example.seance2demo.dao;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.seance2demo.modele.DemoSeance;

@Database(entities = {DemoSeance.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class MaBD extends RoomDatabase {
    public abstract MonDAO dao();
}


