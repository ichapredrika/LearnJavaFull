package com.icha.javafundamental.oop.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        print(ls); // Apakah baris ini valid?

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        print(cp); // Apakah baris ini valid?


        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList();

        //T inferred to be Object
        arrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList();

        //T inferred to be Object
        arrayToCollection(sa, cs);

        //T inferred to be Object
        arrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList();

        //T inferred to be Number
        arrayToCollection(ia, cn);

        //T inferred to be Number
        arrayToCollection(fa, cn);

        //T inferred to be Number
        arrayToCollection(na, cn);

        //T inferred to be Number
        //arrayToCollection(na, cs);
    }

    public static void print(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }

   /* static void arrayToCollection(Object[] a, Collection<?> c){
        for(Object o:a){
            c.add(o);
        }
    }*/

   static <T> void arrayToCollection(T[] a, Collection<T> c){
       for(T o:a){
           c.add(o);
       }
   }
}