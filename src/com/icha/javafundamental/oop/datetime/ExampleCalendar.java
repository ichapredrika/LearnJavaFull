package com.icha.javafundamental.oop.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        System.out.println("Date :" +calendar.get(Calendar.DATE));
        System.out.println("Month :" +calendar.get(Calendar.MONTH));
        System.out.println("Year :" +calendar.get(Calendar.YEAR));

        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yg lalu :" +calendar.getTime());
        calendar.add(Calendar.MONTH, 3);
        calendar.add(Calendar.YEAR, 3);
    }
}
