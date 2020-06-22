package com.icha.javafundamental.oop.function;

public class MethodOverloading {
    public static void main(String[] args){
        double p = 7;
        double l = 6.5;
        double result = countArea(p,l);
        System.out.println("The result = "+result);

        int pn= 7;
        int ln = 6;
        int rslt = countArea(pn, ln);
        System.out.println("The result is = "+ rslt);
    }

    public static double countArea(double length, double width){
        return length * width;
    }

    public static int countArea(int length, int width){
        return length*width;
    }
}
