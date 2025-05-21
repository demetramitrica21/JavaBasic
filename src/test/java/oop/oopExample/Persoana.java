package oop.oopExample;

public abstract class Persoana {
    //oop=programare orientata pe obiect(object oriented programming)
    //patru principii importante: mostenire, incapsulare, polimorfism si abstractizare;

    //Mostenirea in Java este conceptul prin care o clasa (clasa copil) mosteneste o alta clasa(clasa parinte);
    //In momentul in care o clasa mosteneste alta clasa, clasa copil are vizibilitate asupra variabilelor/metodelor din clasa parinte;
    //In java se poate mosteni o singura clasa cu ajutorul cuvantului cheie "extends";
    //In momentul in care o clasa mosteneste o alta clasa, clasa copil apeleaza constructorul din parinte
    //si constructorul din clasa parinte spre copil se apeleaza cu cuvantul cheie "super";

    //Incapsularea= procesul prin care tinem private anumite informatii in asa fel incat acestea sa nu poata fi modificate;
    //Ca sa putem face informatiile private vom face variabilele/metodele din "public" in "private";
    //MODIFICATORI DE ACCES:
    //public= codul se poate accesa de oriunde si din orice clasa;
    //private= codul se poate accesa doar din clasa unde s-a scris codul;
    //protected= codul se poate accesa doar din pachetul in care s-a scris codul, dar si de catre subclase(conceptul oop de mostenire);
    //default= codul se poate accesa doar din pachetul in care s-a scris codul;
    //Ca sa extragem(modificam) o valoare a unei variabile private ne folosim de metode de get/set(getter si setter);

    //Polimorfism= conceptul prin care definim mai multe implementari pentru o metoda;
    //Este de doua tipuri: Static(overloading), Dinamic(overreading)

    //Polimorfismul dinamic intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite;
    //Polimorfismul static= posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau nr de parametri;

    //Abstractizare= este procesul de reducere a complexitatii prin ascunderea detaliilor de implementare si expunerea doar a functionalitatii;
    //Abstractizarea se realizeaza prin clase abstracte si/sau interfete;
    //Clasele abstracte se declara folosind cuvantul cheie "abstract";
    //Pot contine atat metode abstracte, cat si metode concrete(fara corp/cod sau implementare) cat si metode concrete(metodele obisnuite, cu implemetare);
    //Nu pot fi instantiate(nu poti face un obiect intr-o clasa abstracta);
    //Poate fi utilizata numai ca superclasa pentru alte clase care extind clasa abstracta;
    //Poate avea variabile si atribute;

    //Interfata e un protocal pe care clasele trebuie sa il implementeze(ofera raspuns la lipsa mostenirii multiple);
    //O clasa poate mosteni mai multe interfete;
    //Interfata contine doar metode abstracte * interfata poate sa contina si metode cu implementare, dar poti sa ai doua tipuri de metode(default:public void sau static void);
    //Interfetele pot extinde alte interfete;
    //Cuvantul cheie "interface";
    //Pentru a mosteni o interfata folosim cuvantul cheie "implements";



    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }
//fortam implementarea actiunii in clasele copil(angajat si student);
    public abstract void doarme();

    //Polimorfism dinamic-> prima implementare a metodei;
    public void mananca() {
        System.out.println("Persoana mananca de plictiseala");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
