package com.example.demomodeleservice.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(foreignKeys = @ForeignKey(entity = Examen.class,
        parentColumns = "id",
        childColumns = "examenId"
        ))
public class Etudiant {

    @PrimaryKey(autoGenerate = true)
    public Long id;

    @ColumnInfo
    public String prénom;

    @ColumnInfo
    public String nom;

   @ColumnInfo
    public Long examenId;

}
