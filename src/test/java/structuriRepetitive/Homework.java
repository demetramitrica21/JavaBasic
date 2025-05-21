package structuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {


//    1.Faceti o metoda care  sa gaseasca un cuvant dintr-o lista si cand il gaseste sa il printeze in consola
//    Lista de fructe, masini, etc
//    2.Faceti o metoda care  sa gaseasca un cuvant dintr-un hash map si cand il gaseste sa il printeze in consola
//    Hash map de obiecte, animale, etc
//    3.Alte tipuri de HasMap uri cu String, cu char, cu altele;


    @Test

    public void testMethod() {
//        displayCarList("Dacia");
        //displayFruitsList("Orange");
        hashMapAnimals("Crocodile");

        //hashMapPeople("Ciprian");

    }

    //    1.Faceti o metoda care  sa gaseasca un cuvant dintr-o lista si cand il gaseste sa il printeze in consola
    //    Lista de fructe, masini, etc

    public void displayCarList(String car) {
    //create a list Object called carList;
        List<String> carList = new ArrayList<>();

        carList.add("Volvo");
        carList.add("Mercedes");
        carList.add("Suzuki");
        carList.add("Tuareg");
        carList.add("Dacia");

        System.out.println("The list of cars is as follows: " + carList);

        for (int index = 0; index < carList.size(); index++) {
            if (carList.get(index) == car) {
                System.out.println("The car that I want to display is: " + carList.get(index));
            }
        }

    }

    public void displayFruitsList(String fruit) {

        List<String> fruitsList = new ArrayList<>();

        // we create a list of fruits
        fruitsList.add("Maracuja");
        fruitsList.add("Pineapple");
        fruitsList.add("Kiwi");
        fruitsList.add("Orange");
        fruitsList.add("Apple");

        System.out.println("The list of fruits is as follows: " + fruitsList);

        for (int index = 0; index < fruitsList.size(); index++) {
            //if you want to acces a name from the list which is equal to fruit;
            if (fruitsList.get(index) == fruit) {
                System.out.println("The fruit that I want to display is: " + fruitsList.get(index));
            }
        }


    }

    //    2.Faceti o metoda care  sa gaseasca un cuvant dintr-un hash map si cand il gaseste sa il printeze in consola
    //    Hash map de obiecte, animale, etc

    public void hashMapAnimals(String animal) {
        HashMap<String, String> animalCategories = new HashMap<>();

        //we add some animals in Hashmap
        animalCategories.put("Mammal", "Whale");
        animalCategories.put("Bird", "Hummingbird");
        animalCategories.put("Reptile", "Crocodile");
        animalCategories.put("Insect", "Bee");

        System.out.println("The displayed list of animals is: " + animalCategories);

        // we search if the word exists in HashMap and then we will print it out;
        for (String key : animalCategories.keySet()) {
            if (animalCategories.get(key) == animal) {
                System.out.println("The animal that I want to be displayed is: " + animalCategories.get(key));
            }
        }
    }
    //    3.Alte tipuri de HasMap uri cu Character, Integer, Double, Boolean;

//    public void hashMapPeople(String name) {
//
//        //create a HasMap Object called people;
//        HashMap<String, Integer> people = new HashMap<>();
//
//        //Add keys and values to the people(name and age);
//
//        people.put("Iulia", 31);
//        people.put("Ionut", 43);
//        people.put("Ciprian", 20);
//
//        System.out.println("The list of people is: " + people);
//
//        for (String key : people.keySet()) {
//            if (people.get(key)) {
//                System.out.println("The name I want to display is: " + key + "and his/her age is: " + people.get(key));
//            }
//        }
//
//    }

}


