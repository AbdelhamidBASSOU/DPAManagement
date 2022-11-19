package com.dpamanagement.repository.implementation;

import com.dpamanagement.entity.Exercice;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ExerciceRepositoryImpTest {

    @Test
    void add() {
        Exercice e = new Exercice();
        e.setEndDate(LocalDate.ofEpochDay(2000-12-12));
        e.setDateStart(LocalDate.ofEpochDay(2000-12-10));
        e.setDescription("just for unit test");
        e.setYear("2000");
        e.setState(true);
     ExerciceRepositoryImp ei = mock(ExerciceRepositoryImp.class) ;
     doNothing().when(ei).add(e);
     ei.add(e);
     verify(ei,times(1)).add(e);
    }
    @Test
    void update(){
        Exercice e = new Exercice();
        e.setEndDate(LocalDate.ofEpochDay(2000-12-12));
        e.setDateStart(LocalDate.ofEpochDay(2000-12-10));
        e.setDescription("just for unit test");
        e.setYear("2000");
        e.setState(true);
        ExerciceRepositoryImp ei = mock(ExerciceRepositoryImp.class) ;
        doNothing().when(ei).update(e);
        ei.update(e);
        verify(ei,times(1)).update(e);
    }

}