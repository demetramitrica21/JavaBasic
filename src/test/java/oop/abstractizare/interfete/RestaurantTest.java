package oop.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaurantTest {
    @Test
    public void activitateRestaurant(){
        Bucatar Ion= new Bucatar();
        Ion.pregatesteMancarea("Mititei");

        Chelner Petre= new Chelner();
        Petre.primesteComanda(2);
        Petre.servesteMancarea("Mititei","Ileana");
        Petre.curataMasa(14);
        Petre.spalaVase();

        Ospatar Vasile = new Ospatar();
        Vasile.primesteComanda(2);
        Vasile.servesteMancarea("pizza","Dorel");

        AsistentBucatar Maria = new AsistentBucatar();
        Maria.curataMasa(7);
        Maria.spalaVase();

        //diferenta dintre clasa abstracta si Interfete(flexibilitatea sa putem adauga multe actiuni specifice pt anumite elemente, roluri)
        //clasa abstracta: o informatie care vrem sa fie transmise in alte clase;
    }
}
