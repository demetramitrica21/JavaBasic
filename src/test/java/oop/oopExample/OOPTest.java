package oop.oopExample;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void oopExampleTest(){
        System.out.println("===Exemplu student===");
        Student Ionel = new Student("Popescu","Ionel",20,"Facultatea de Constructii",
                "Rezistenta materialelor",true);
//        Ionel.infoStudent();
//        Ionel.setNume("Porumbescu");
//        Ionel.infoPersoana();
//        Ionel.infoStudent();
        Ionel.mananca();
        Ionel.invata(10);
        Ionel.invata("Dictare");
        Ionel.doarme();
        Ionel.mergeLaPetreceri();
        Ionel.sustineExamene();
        Ionel.invata();
        Ionel.mergeLaSeminar();

        System.out.println("===Exemplu angajat===");
        Angajat Teodor = new Angajat("Ionescu","Teodor",30,"Oracle",
                7500.0,4);
//        Teodor.infoAngajat();
//        Teodor.setSalariu(3500.0);
//        Teodor.infoPersoana();
//        Teodor.infoAngajat();

        Teodor.mananca();
        Teodor.marire("Senior");
        Teodor.marire(10);
        Teodor.marire("vechime",750);
        Teodor.doarme();
        Teodor.mergeLaMunca();
        Teodor.isiIaConcediu();
        Teodor.munceste();
        Teodor.primesteSalariu();

        System.out.println("===Exemplu student angajat===");
        StudentAngajat Elena= new StudentAngajat("Ionescu","Elena",27);
        Elena.mergeLaPetreceri();
        Elena.mergeLaSeminar();
        Elena.isiIaConcediu();
        Elena.primesteSalariu();
        Elena.infoPersoana();
    }
}
