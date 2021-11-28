package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("abc", 1 ,1, 5, 12);
        System.out.println("Animal name is " + animal.getName() );

        Dog dog = new Dog("Rocky", 8, 30, 2,4,20, 1);
        System.out.println("Dog name is " + dog.getName());

        dog.eat();

        Fish fish = new Fish("Nemo", 2, 10, 1,1 );
        System.out.println("Fish name is " + fish.getName());
    }
}
