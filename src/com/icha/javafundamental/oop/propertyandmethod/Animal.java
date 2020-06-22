package com.icha.javafundamental.oop.propertyandmethod;

public class Animal {

    //property
    double height=30;
    double weight=3;
    int age;

    Animal(int age){
        this.age = age;
    }

    void run(){
        System.out.println("run");
    }

    void walk(){
        System.out.println("walk");
    }

    double getWeight(){
        return weight;
    }

    double getHeight(){
        return height;
    }


}
