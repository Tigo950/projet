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
}
