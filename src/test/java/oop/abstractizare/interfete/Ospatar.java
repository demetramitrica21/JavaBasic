package oop.abstractizare.interfete;

public class Ospatar implements ServesteInterface{
    @Override
    public void primesteComanda(int numarComanda) {
        System.out.println("Ospatarul preia comanda cu numarul " + numarComanda);
    }

    @Override
    public void servesteMancarea(String tipDeMancare, String numeleClientului) {
        System.out.println("Ospatarul duce mancare " + tipDeMancare + " la clientul " + numeleClientului);
    }
}
