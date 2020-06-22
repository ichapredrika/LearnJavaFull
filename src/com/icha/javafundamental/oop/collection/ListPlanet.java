package com.icha.javafundamental.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args){
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1]= "sven";

        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("Inital Planets");
        for (int i =0; i< planets.size();i++){
            System.out.println("\t index-"+i + " = " + planets.get(i));
        }

        planets.remove("venus");

        System.out.println("Final Planets");
        for(int i=0; i < planets.size(); i++){
            System.out.println("\t index-"+i +" = "+ planets.get(i));
        }

        for (Iterator iterator = planets.iterator();iterator.hasNext();){
            System.out.println("\t " +iterator.next());
        }
    }
}
