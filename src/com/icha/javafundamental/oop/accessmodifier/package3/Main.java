package com.icha.javafundamental.oop.accessmodifier.package3;

public class Main {
    public static void main(String[] args){

        System.out.println("The value is " + Calculation.value);

        for (int i=0; i<5; i++){
            new Calculation();
        }

        System.out.println("Sampai "+ Calculation.value);
        System.out.println("GetValue "+ Calculation.getValue());
    }
}
