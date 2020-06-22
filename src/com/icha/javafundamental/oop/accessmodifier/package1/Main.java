package com.icha.javafundamental.oop.accessmodifier.package1;

public class Main {
    public static void main(String[] args){
        ClassA classA = new ClassA();
        //System.out.println(classA.memberA()); cant be accessed cus private
        System.out.println(classA.functionB());
    }
}
