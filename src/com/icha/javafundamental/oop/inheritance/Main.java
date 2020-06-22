package com.icha.javafundamental.oop.inheritance;

public class Main {
    public static void main(String [] args){
        Animal animal = new Animal(); //call constructor
        System.out.println("Is animal an Object -> " + (animal instanceof Object));
        System.out.println("Is animal an Animal -> " + (animal instanceof Animal));
        System.out.println("Is animal a Cat -> " + (animal instanceof Cat));

        System.out.println("----------------------");

        Cat cat = new Cat();
        System.out.println("Is cat an Object -> " + (cat instanceof Object));
        System.out.println("Is cat an Animal -> " + (cat instanceof Animal));
        System.out.println("Is cat a Cat -> " + (cat instanceof Cat));

        System.out.println("--------------------");

        animal.eat();
        cat.eat();
        cat.eat("Shit");

        System.out.println("-------------------");
        Cat meow = new Cat("Ocicat", "tropic");
        Cat puss = new Cat("Ocicat", "subtropic");
        Cat popo = new Cat("Anggora", "subtropic");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " +meow.equals(puss));
        System.out.println("meow equals popo ? "+ meow.equals(popo));

        System.out.println("--------------");

        Object o = new Cat();
        Animal a = new Cat();
        Cat c = new Cat();

        //o.eat();
        a.eat();
        c.eat();

        Object object = c;
        Animal animalA = c;

        animalA.eat();

        Cat catC = (Cat) a; //tidak bisa langsung diassign, perlu casting
        catC.eat();

        Animal lion = new Animal();
        //Cat anggora = (Cat) lion; //compile Ok tapi runtime error ClassCastException

        Mammal mammal = new Cat();
    }
}
