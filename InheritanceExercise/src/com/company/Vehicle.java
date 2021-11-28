package com.company;

public class Vehicle {

    private String name;
    private int size;

    private  int currentVelocity;
    private  int currentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees." );
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + velocity + " kmph in direction " + direction + " degrees.");
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
