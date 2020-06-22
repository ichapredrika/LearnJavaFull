package com.icha.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sedernaha");
        System.out.print("Input the first number: ");
        int value1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int value2 = scanner.nextInt();
        int result = value1 + value2;
        System.out.println("Result: "+ result);
    }

}
