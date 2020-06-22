package com.icha.javafundamental.oop.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String formatedDate = sdf.format(new Date());

        System.out.println("Default: " + new Date());
        System.out.println("Formated: " + formatedDate);
    }
}
