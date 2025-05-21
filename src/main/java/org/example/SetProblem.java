package org.example;
import java.util.HashSet;
import java.util.Set;

public class SetProblem {

    public void main(String[] args){
        Set<String> set= new HashSet<>();
        set.add("knead");
        set.add("oil pan");
        set.add("turn on oven");
        set.add("roll");
        set.add("turn on oven");
        set.add("bake");
        System.out.println(set);
    }
}
