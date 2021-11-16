package com.example.demostockage.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.demostockage.modele.DemoSeance;

import java.util.List;

@Dao
public interface MonDao {
    @Insert
    Long creerSeance(DemoSeance s);

    @Query("SELECT * FROM DemoSeance")
    List<DemoSeance> listSeance();



}
