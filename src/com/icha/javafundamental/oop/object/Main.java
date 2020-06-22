package com.icha.javafundamental.oop.object;

public class Main {
    public static void main(String[] args) {
        Animal eagle = new Animal("Eagle");
        eagle.animalWeight(2);
        eagle.legAmount(2);
        eagle.printName();
        Animal cat = new Animal("Cat");
        cat.animalWeight(1);
        cat.legAmount(4);
        cat.printName();
    }
}
