package com.icha.javafundamental.oop.inheritance;

public class Cat extends Animal implements Mammal{
    private String race;
    private String habitat;

    public Cat(String race, String habitat){
        this.race = race;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "The race: " + race + ", habitat: "+ habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat){
            Cat other = (Cat) obj;
            return this.race.equals(other.race);
        }else{
            return false;
        }
    }

    public Cat(){
        super(); //akan tetap memanggil constructor dari parent class
        System.out.println("Construct Cat");
    }

    public void eat(){//overriding
        System.out.println("Cat is eating shit");
    }

    public void eat(String food){//overloading
        System.out.println("Cat is eating "+food);
    }

}
