package com.dpamanagement.service;

import com.dpamanagement.entity.Exercice;

import java.util.List;

public interface ExerciceService {
    List < Exercice > getAll();
    void add(Exercice exercice);
    void delete(int id);
    int count();

    void update(Exercice exercise);
}
