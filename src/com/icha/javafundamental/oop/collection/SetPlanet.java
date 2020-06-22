package com.icha.javafundamental.oop.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args){
        //using HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");

        System.out.println("Initial planets set: (size = "+planets.size()+ ")");
        for(String planet: planets){
            System.out.println("\t "+ planet);
        }

        planets.remove("venus");

        System.out.println("Final planet set: (size : " +planets.size() + ")");
        for(Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println("\t "+iterator.next());
        }
    }
}
