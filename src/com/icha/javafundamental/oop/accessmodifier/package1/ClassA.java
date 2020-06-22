package com.icha.javafundamental.oop.accessmodifier.package1;

public class ClassA {
    private int memberA = 5;
    //default
    char memberB = 'A';
    double memberC = 1.5;


    private int functionA(){
        return memberA;
    }

    int functionB(){
        int result = functionA() + memberA;
        return result;
    }

    protected void methodC(){
        System.out.println("Trial of access modifier!");
    }

}
