package com.example.seance2demo.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.seance2demo.modele.DemoSeance;

import java.util.List;

@Dao
public interface MonDAO {


    @Insert
    Long insertSeance(DemoSeance seance);

    @Query("SELECT * FROM DemoSeance")
    List<DemoSeance> listSeance();


}
