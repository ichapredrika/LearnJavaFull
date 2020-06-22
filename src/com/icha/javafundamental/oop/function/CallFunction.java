package com.icha.javafundamental.oop.function;

public class CallFunction {
    public static void main(String[] args){
        tryFunction();

        double p = 7;
        double l =6.5;

        double result = countArea(p,l);
        System.out.println("The result is = " + result);
    }

    public static double countArea(double length, double width){
        double area = length * width;
        return area;
    }
    /*
    public static void countArea(double length, double width){
        double area = length* width;
    }*/

    public static void tryFunction(){
        System.out.println("This is a part of function");
    }
}
