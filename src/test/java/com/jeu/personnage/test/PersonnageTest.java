package com.jeu.personnage.test;

import com.jeu.personnage.Personnage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest {
    @Test
    public void testTournerUneFois(){
        Personnage personnage=new Personnage();
        assertEquals("EST",Personnage.tourner(1));
    }
    @Test
    public void testTournerDeuxFois(){
        Personnage personnage= new Personnage();
        assertEquals("SUD",Personnage.tourner(2));
    }/*
    @Test
    public void testTournerTroisFois(){
        Personnage personnage=new Personnage();
        assertEquals("OUEST",Personnage.tourner(3));
    }
    @Test
    public void testTournerQuatreFois(){
        Personnage personne=new Personnage();
        assertEquals("NORD",Personnage.tourner(4));
    }*/
}
