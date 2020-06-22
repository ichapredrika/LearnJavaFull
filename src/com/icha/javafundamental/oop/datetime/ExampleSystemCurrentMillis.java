package com.icha.javafundamental.oop.datetime;

import java.util.Date;

public class ExampleSystemCurrentMillis {
    public static void main (String[] args){
        long timeNow = System.currentTimeMillis();

        System.out.println("Current time "+ timeNow);

        Date date = new Date();
        System.out.println(date.toString());
    }
}
