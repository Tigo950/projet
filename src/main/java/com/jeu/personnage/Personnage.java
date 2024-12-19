package com.jeu.personnage;

public class Personnage {
private int indexorientation;
private static final String[] orientations={
    "NORD","EST","SUD","OUEST"
    };
public Personnage(){
    this.indexorientation=0;
}
public static String tourner(int fois){
    if(fois%4==1) return"EST";
    else if (fois%4==2) return "SUD";
    /*else if(fois%4==3) return "OUEST";
    else if(fois%4==0) return "NORD";*/
    return "NULL";
}

}
