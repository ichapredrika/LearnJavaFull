package com.icha.javafundamental.oop.object;

public class Animal {
    String name;
    int weight;
    int legAmount;

    public void printName(){
        System.out.println("Animal name: " + name);
        System.out.println("Animal weight: " + weight);
        System.out.println("Animal legs: " + legAmount);
    }

    public Animal(String name){
        this.name = name;
    }

    public void animalWeight(int weight){
        this.weight = weight;
    }

    public void legAmount(int legAmount){
        this.legAmount = legAmount;
    }

}
