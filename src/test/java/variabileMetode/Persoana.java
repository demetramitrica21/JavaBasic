package variabileMetode;

import org.testng.annotations.Test;

public class Persoana {

//    O clasa in Java este o structura care defineste atat atributele/variabilele/proprietati, cat si metodele unui obiect;
//    Tipurile de date in java sunt: date primitive= stocheaza direct valoarea;
//    datele primitive contin 8 tipuri de date:
//    byte(8 bit);
//    short(16 bit);
//    int(32 bit);
//    long(64 bit);
//    double(numere zecimale);
//    float(numere zecimale, dar are precizie mai mica decat double);
//    char(single character);
//    boolean(true or false- valori logice);
//    date de referinta= stocheaza doar referinta catre un obiect(adresa in memorie);
//    tipuri de date de referinta: clase, interfete, arrays, liste;


//    Tipuri de variabile:
//    1.variabile de instanta(globale)= proprii fiecarei instante;
//    2. variabile locale= din interiorul metodelor;


//    Metodele= un bloc de cod care indeplineste o functie specifica(o actiune, un comportament);
//    Tipuri de Metode-
//    Metode Void fara return= ruleaza logica din interior si nu returneaza nimic;
//    modificatori de acces: public, private, protected) void numeleMetodei(cu parametri sau fara){
//    logica sau corpul metodei(ce face metoda);
//    }
//    Metode cu return= returneaza tipul de data;
//    modificatori de acces: public, private, protected) tipulReturnat(int/String) numeleMetodei(cu parametri sau fara){
//    logica sau corpul metodei(ce face metoda);
//    return valoarea de tipulReturnat
//    }

    //    declaram variabile globale(instante)
    String numelePersoanei = "Popescu";
    String prenumelePersoanei = "Andrei";
    char sexulPersoanei = 'M';
    int anDeNastere = 2000;

//    metoda de test;

    @Test //adnotarea
    public void afisareVariabileGlobaleTest() {
        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are numele: " + prenumelePersoanei);
        System.out.println("Persoane este de sexul: " + sexulPersoanei);
    }

    @Test
    public void afisareDetaliiPersoana() {
        //declaram variabile locale;
        double inaltimeaPersoanei = 1.81;
        int varstaPersoanei = 31;
        String adresaPersoanei = " Strada Ana Ipatescu nr126";

        System.out.println("Detaliile persoanei sunt: ");
        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are numele: " + prenumelePersoanei);
        System.out.println("Persoane este de sexul: " + sexulPersoanei);
        System.out.println("Inaltimea persoanei este: " + inaltimeaPersoanei);
        System.out.println("Varsta persoanei este: " + varstaPersoanei);
        System.out.println("Adresa persoanei este " + adresaPersoanei);
    }

    @Test
    public void afisareDetaliiProfesionale() {
        System.out.println("Varsta actuala a persoanei este: " + calculeazaVarsta(2025));
        System.out.println("Persoana este adulta? " + esteAdult(16));
        System.out.println("Persoana este adulta? " + esteAdult(calculeazaVarsta(2025)));
    }

    public int calculeazaVarsta(int anulActual) {
        return anulActual - anDeNastere;
    }

    public boolean esteAdult(int varsta) {
        return varsta >= 18;
    }

}
