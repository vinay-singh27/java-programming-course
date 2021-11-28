package com.company;

public class Fish extends  Animal{

    private int fins;
    private int gills;

    public Fish(String name, int size, int weight, int fins, int gills) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.gills = gills;
    }

    public void swim() {
        System.out.println("Fish.swim() is executed");
    }
}
