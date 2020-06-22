package com.icha.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Addition is easy");
        int value1 = 0;
        int value2 = 0;

        try{
            System.out.print("Input the first number: ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Input the second number: ");
            value2 = Integer.parseInt(bufferedReader.readLine());

        }catch (IOException e){
            e.printStackTrace();
        }
        int result = value1 + value2;
        System.out.println("The result is : " + result);
    }
}
