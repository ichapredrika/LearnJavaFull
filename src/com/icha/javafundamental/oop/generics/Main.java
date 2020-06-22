package com.icha.javafundamental.oop.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List lo = new ArrayList(); //without type parameter
        lo.add("lo - String 1"); //contain String object
        lo.add(new Planet("Mercury", 0.06)); //contain Planet object

        for (Object o:lo){
            Planet p = (Planet) o; //need type-casting from object to planet
            p.print();
        }
        List<Planet> lp = new ArrayList(); //with type-parameter - planet
        lp.add(new Planet("Mercury", 0.06));
        lp.add(new Planet("Venus", 0.06));
        //lp.add("lp - String 1"); //compile error

        for(Planet p: lp){
            p.print();
        }
    }
}
