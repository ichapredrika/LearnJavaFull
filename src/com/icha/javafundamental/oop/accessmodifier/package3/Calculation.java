package com.icha.javafundamental.oop.accessmodifier.package3;

public class Calculation {
    public static int value = 0;
    final int valueFinal = 5;

    Calculation(){
        value++;
    }

    protected static int getValue(){
        return value;
    }

    void changeValue(){
        //valueFinal = 10;
    }
}
