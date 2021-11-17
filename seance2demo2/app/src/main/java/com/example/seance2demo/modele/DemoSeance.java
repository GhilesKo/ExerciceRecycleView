package com.example.seance2demo.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class DemoSeance {

    @PrimaryKey(autoGenerate = true)
    public Long seanceId;

    @ColumnInfo
    public Date dateSeance;

}
