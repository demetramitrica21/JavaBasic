package oop.abstractizare.interfete;

public class Chelner implements ServesteInterface, CurataInterface {

    @Override
    public void primesteComanda(int numarComanda) {
        System.out.println("Chelnerul primeste comanda cu numarul " + numarComanda);
    }

    @Override
    public void servesteMancarea(String tipDeMancare, String numeleClientului) {
        System.out.println("Chelnerul duce mancarea " + tipDeMancare + " la clientul " + numeleClientului);
    }

    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Chelnerul curata masa cu numarul " + numarMasa);
    }

    @Override
    public void spalaVase() {
        System.out.println("Chelnerul spala vasele la final de program");
    }
}
