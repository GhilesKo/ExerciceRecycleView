package com.example.demostockage.modele;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class DemoSeance {

    @PrimaryKey(autoGenerate = true)
    public Long seanceId;

    //type de seance >> Si seance a debuté, prise fin, destroyed . . .
    public String typeSeance;

    public Date dateSeance;








}
