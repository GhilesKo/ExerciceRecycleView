package com.example.demomodeleservice.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Etudiant.class,
        parentColumns = "id",
        childColumns = "etudiantId"
))
public class Examen {

    @PrimaryKey(autoGenerate = true)
    public Long id;

    @ColumnInfo
    public String titreExamen;

    @ColumnInfo
    public Long ponderation;

    @ColumnInfo
    public Long noteObtenu;

    @ColumnInfo
    public Long etudiantId;


}
