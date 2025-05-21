package obiectConstructor;

import org.testng.annotations.Test;

public class ContBancarTest {

    @Test
    public void metodaContBancarTest (){
        System.out.println("====Exemplul 1 ====");
        ContBancar contValid = new ContBancar("Mihaela",3000.0);
        contValid.infoCont();
        System.out.println("====Exemplul 2 ====");
        ContBancar contInvalid = new ContBancar("Costel",90.0);
        contInvalid.infoCont();
    }
}
