package com.example.demostockage.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.example.demostockage.modele.DemoSeance;

@Database(entities = {DemoSeance.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class MaBD extends RoomDatabase {
    public abstract MonDao dao();
}


