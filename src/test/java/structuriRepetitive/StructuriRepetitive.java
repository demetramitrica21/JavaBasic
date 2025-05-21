package structuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    @Test

    public void metodaTest() {
//        colegiDeCursArray();
//        colegiDeCursLista();
//        afisareHashMap();
        afisareHashMap2();
    }

    //In java un arrays(multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip(fie primitive, fie obiecte)
    //Dimensiunea este fixa: o data ce este creata multimea, dimensiunea nu se poate schimba;
    //Elementele trebuie sa fie de acelasi tip;
    //Accesul la elemente se face prin indexul acestora;

    public void colegiDeCursArray() {

        //cream o multime de String-uri

        String[] colegi = new String[6];
        colegi[0] = "Marius";
        colegi[1] = "Eugen";
        colegi[2] = "Gigi";
        colegi[3] = "Hilda";
        colegi[4] = "Gabi";
        colegi[5] = "Sanziana";
        // colegi[6]= "Razvan";

        System.out.println("Exemplu multimi");

        // "For" este o structura de control utilizata pt a itera o secventa de instructiuni sau pt a parcurge un anumit interval de valori;
        //Structura
        //for(initializare; conditie; increment/decrement){
        //bloc de cod care va fi executat repetat;
        //}

        for (int index = 0; index < colegi.length; index++) {

            System.out.println("Numele colegului de pe pozitia: " + index + " este: " + colegi[index]);
        }

//        String[] Colegi = {"Marius"
//                ,"Eugen"
//                ,"Gigi"
//                ,"Hilda"
//                ,"Sanziana"};
//
//        for(String i : Colegi){
//            System.out.println(i);
//        }

    }

    public void colegiDeCursLista() {
        //Listele sunt o colectie ordonata de elemente de acelasi tip;
        //Elementele sunt stocate in ordinea in care sunt adaugate;
        //Accesarea se face tot prin index;
        //Elementele unei liste pot fi parcurse folosind bucle sau interatori;
        //In liste sunt permise elemente duplicat;
        //In java sunt mai multe clase care implementeaza listele, cele mai comune fiind ArrayList si LinkedList;

        //exemplu lista

        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Maria");
        colegiLista.add("Petronela");
        colegiLista.add("Gabriel");
        colegiLista.add("Calin");
        colegiLista.add("Adrian");
        colegiLista.add("Demetra");

        System.out.println("Exemplu liste");

        //"while" este o structural de control utilizata pt a executa repetat un bloc de cod atata timp cat o anumita conditie este adevarata;
        //In timp ce structura "for" este utilizata pt a itera printr-o secventa de instructiuni un nr cunoscut de iteratii;
        //Structura "while" este folosita atunci cand nr de interatii nu este cunoscut in avans, dar se stie doar conditia;
        //Structura
        //initializare index;
        //while(conditie){
        //bloc de cod care va fi executat atata timp cat conditia e adevarata;
        // incrementare/decrementare;
        //}

        int index = 0;
        while (index < colegiLista.size()) {

            System.out.println("Numele colegului de pe pozitia: " + index + " este: " + colegiLista.get(index));
            index++;

        }
        //O alta varianta a parcurgerii unei Liste
//        int index = 0;
//        while ( colegiLista != null ){
//            System.out.println("Numele colegului de la numarul: " + index + " este " + colegiLista.get(index));
//            index++ ;
//        }

    }

    public void afisareHashMap() {

        //Hash Map ofera o implementare a unei colectii de tip pereche(cheie-valoare);
        //Intr-un Hash Map cheile sunt unice, deci nu pot fi duplicate; fiecare cheie poate fi asociata cu cel mult o valoare;

        HashMap<String, String> categorieObiecte = new HashMap<>();
        categorieObiecte.put("fructe", "mar");
        categorieObiecte.put("animale", "urs");
        categorieObiecte.put("flori", "liliac");

        System.out.println("Exemplu Hash Map");

        //"Foreach" structura de control cunoscuta si sub numele de enhancedforloop;
        //se utilizeaza pentru a intera printr-o colectie fara sa fie nevoie de un iterator explicit sau sa se lucreze cu indici;
        //Structura:
        //for as foreach(tip element numeElement: colectia){
        //  bloc de cod executat pt fiecare element din colectie
        // }

        for (String key : categorieObiecte.keySet()) {

            System.out.println("Categoria este " + key + " Valoarea este: " + categorieObiecte.get(key));
        }
    }

    public void afisareHashMap2() {

        System.out.println("Exemplu Hash Map2");

        HashMap<String,List<String>> tariOrase= new HashMap<>();

        //Adaugam 3 seturi de liste pe care le vom folosi in Hashmap;

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Targu Mures");
        oraseRomania.add("Cluj Napoca");
        oraseRomania.add("Ploiesti");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Valencia");
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");

        List<String> oraseAmerica = new ArrayList<>();
        oraseAmerica.add("Washington");
        oraseAmerica.add("New York");
        oraseAmerica.add("Chicago");

        //adaugam valorile in HashMap

        tariOrase.put("Romania",oraseRomania);
        tariOrase.put("Spania",oraseSpania);
        tariOrase.put("USA",oraseAmerica);

        for (String key : tariOrase.keySet()) {

            System.out.println("Tara este " + key + " orasele sunt: " + tariOrase.get(key));//print keys
        }
    }

}
