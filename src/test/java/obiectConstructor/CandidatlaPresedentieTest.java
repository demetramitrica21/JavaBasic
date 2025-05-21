package obiectConstructor;

import org.testng.annotations.Test;

public class CandidatlaPresedentieTest {

    @Test
    public void verificarePresedinteTest(){
        System.out.println("====Exemplul 1====");
        CandidatlaPresedentie candidatPromitator = new CandidatlaPresedentie(10000,"Popescu");
        System.out.println("Numele candidatului promitator este: " + candidatPromitator.getNume() + " si are " + candidatPromitator.getNumarVoturi() + " de voturi");
        System.out.println("====Exemplul 2====");
        CandidatlaPresedentie candidatSlab = new CandidatlaPresedentie(3000,"Ïonescu");
        System.out.println("Numele candidatului slab este: " + candidatSlab.getNume() + " si are " + candidatSlab.getNumarVoturi() + " voturi ");
        System.out.println("====Exemplul 3====");
        CandidatlaPresedentie candidatNecunoscut = new CandidatlaPresedentie(300,"");
        System.out.println("Numele candidatului necunoscut este: " + candidatNecunoscut.getNume() + " si are " + candidatNecunoscut.getNumarVoturi() + " de voturi ");
    }
}
