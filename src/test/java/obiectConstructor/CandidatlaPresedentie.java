package obiectConstructor;

public class CandidatlaPresedentie {
    public String nume;
    public Integer numarVoturi;

    //cream o clasa constructor care are acelasi nume ca si clasa si primeste valorile atributelor din clasa(nume si numarVoturi);
    public CandidatlaPresedentie(Integer numarVoturi, String nume) {
        this.numarVoturi = validareNumarVoturi(numarVoturi);
        this.nume = verificaNume(nume);
    }
    //facem o metoda pentru validarea numelui;

    public String verificaNume(String nume) {
        if (nume == null || nume.isEmpty()) {
            return "Necunoscut.";
        }
        return nume;
    }

    //facem o metoda pentru validarea numarului de voturi;

    public Integer validareNumarVoturi(Integer numarVoturi) {
        if (numarVoturi <= 5000) {
            return 0;
        }
        return numarVoturi;
    }

    public Integer getNumarVoturi(){
        return numarVoturi;
    }
    public String getNume(){
        return nume;
    }
}
