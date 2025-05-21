package variabileMetode;

import org.testng.annotations.Test;

public class Animal {

    String name = "Gooffy";
    int age = 5;
    String breed = "Bulldog";
    String waist = "small";

    public void displayAnimalAge(int age) {

        System.out.println("The dog's age is " + age);
    }

    public int displayTheBirthYear(int actualYear) {
        return actualYear - age;
    }

    public String getANewName(String newName) {
        return newName;
    }

    public boolean esteAdult(int varsta) {
        return varsta > 10;
    }

    @Test
    public void displayInfosAndMethodsForAnimalTest() {

        boolean adopted = true;
        char dogssex = 'F';
        String ownerName = "Fred";

        System.out.println("The dog's name is: " + name);
        System.out.println("The dog's age is: " + age);
        System.out.println("The dog's breed is: " + breed);
        System.out.println("The dog's waist is: " + waist);
        System.out.println("Is this dog adopted? " + adopted);
        System.out.println("The dog's sex is: : " + dogssex);
        System.out.println("The owner's name is : " + ownerName);
        System.out.println("The birth year of the dog is: " + displayTheBirthYear(2025));
        System.out.println("The new name for the dog is: " + getANewName("Theodor"));
        System.out.println("Is the dog an adult? " + esteAdult(4));
        displayAnimalAge(10);
    }

}
