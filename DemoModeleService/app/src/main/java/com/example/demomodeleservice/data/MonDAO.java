package com.example.demomodeleservice.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.demomodeleservice.modele.Etudiant;
import com.example.demomodeleservice.modele.Examen;

import java.util.List;

@Dao
public interface MonDAO {
    @Insert
    Long insertEtudiant(Etudiant etudiant);

    @Insert
    Long insertExamenEtudiant(Etudiant etudiant, Examen examen);

    @Query("SELECT * FROM Etudiant")
    List<Etudiant>getAll();

    @Query("SELECT * FROM Examen")
    List<Examen>getAllExams();







}
