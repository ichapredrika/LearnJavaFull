package com.icha.javafundamental.oop.casting;

public class Main {
    public static void main(String[] args){
        Cat anggora = new Cat();

        Animal animal = anggora; //upcasting implicit
        animal = (Animal) anggora; //explicit

        Animal animal2 = new Cat();
        ((Cat) animal2).meow(); //downcast
    }

}
