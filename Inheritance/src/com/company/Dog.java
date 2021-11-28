package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
    }

    public void chew() {
        System.out.println("Dog.chew()");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat()");
        chew();
        super.eat();
    }
}
