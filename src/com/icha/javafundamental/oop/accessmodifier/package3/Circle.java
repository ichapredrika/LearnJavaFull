package com.icha.javafundamental.oop.accessmodifier.package3;

public class Circle {
    static final double PI = 3.141;

    int radius = 7;

    final double getArea(){
        return PI* (radius * radius);
    }
}
