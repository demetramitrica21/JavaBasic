package variabileMetode;

import org.testng.annotations.Test;

public class MobilePhone {
//    Tema(facem mai multe teme cu mai multe Clase);
//   1 O clasa Casa
//	- Min 3 variabile globale
//	- Min 3 variabile locale in oricare metoda
//	- 2 metode void - 1 cu parametrii una fara
//	- 2 metode cu return - 1 cu parametrii si una  fara parametri
//1 metoda de test - afisare in consola toate variabilele si metodele facute

    //we declare globale variables;

    String mobileModel = "Iphone 13 mini";
    String mobileOperatingSystem = "IOS";
    String color = "Black";
    double height = 13.15;
    double width = 6.42;
    double depth = 0.77;
    String mobileNumber = "0743756789";

    public void displayMobileColor(String color) {
        System.out.println("The phone's color is: " + color);
    }

    public String getmobileNumber() {
        return mobileNumber;
    }

    public String getNewMobileColor(String newColor) {
        return newColor;
    }

    public String getNewModel(String newModel) {
        return newModel;
    }


    @Test
    public void displayAllInfosAndMethodsTest() {
        // we declare local variables;

        String brand = "Apple";
        int internMemory = 128;
        boolean bluetooth = true;
        boolean nfc = true;

        System.out.println("The mobile phone model is: " + mobileModel);
        System.out.println("The mobile operating system is: " + mobileOperatingSystem);
        System.out.println("The color of the phone is: " + color);
        System.out.println("The height of Iphone 13 mini is: " + height + " cm");
        System.out.println("The width of Iphone 13 mini is: " + width + " cm");
        System.out.println("The depth of Iphone 13 mini is: " + depth + " cm");
        System.out.println("The brand of the mobile phone is: " + brand);
        System.out.println("The intern memory of the mobile phone is: " + internMemory + " GB");
        System.out.println("Does it have bluetooth? " + bluetooth);
        System.out.println("Does it have NFC? " + nfc);
        System.out.println("The mobile phone number is: " + getmobileNumber());
        System.out.println("The new phone's color is: " + getNewMobileColor("Purple"));
        System.out.println("The new phone's model is: " + getNewModel("Iphone 16 Pro"));
        displayMobileColor("Green");
    }
}

