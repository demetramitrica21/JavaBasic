package oop.oopExample;

public class Student extends Persoana implements StudentInterface {

    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, String cursuri, Boolean bursa) {
        super(nume, prenume, varsta); //apelez constructorul parintelui;
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }
    public void infoStudent(){
        System.out.println("Studentul " + getNume() + " este student la facultatea " + facultate);
        System.out.println("Studentul " + getPrenume() + " are cursuri de " + cursuri);
        System.out.println("Varsta studentului " + getNume() + " " + getPrenume() + " este " + getVarsta() + " si are/nu are bursa " + bursa);
    }

    @Override
    public void doarme() {
        System.out.println("Studentul doarme cand nu invata pentru examene si nu merge in club");
    }

    //Polimorfism dinamic-> a doua implementare a metodei;
    public void mananca(){
        System.out.println("Studentul mananca cand are bani");
    }
    public void invata(){
        System.out.println("Studentul invata doar in sesiune");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul sustine examene in sesiune");
    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Studentul merge la petreceri fara sa refuze niciuna");
    }

    @Override
    public void mergeLaSeminar() {
        System.out.println("Studentul merge la seminar pentru a avea minim 70% prezenta");
    }

    public void invata(String curs){
        System.out.println("Studentul invata pentru cursul: " + curs);
    }

    public void invata(int timp){
        System.out.println("Studentul invata: " + timp + "ore pe zi");
    }

    public String getFacultate() {
        return facultate;
    }

    public String getCursuri() {
        return cursuri;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }

}
