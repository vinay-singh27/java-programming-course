package com.company;

public class Room {

    private Walls rightWall;
    private Walls leftWall;
    private Walls frontWall;
    private Walls backWall;
    private Floor floor;
    private Ceiling ceiling;

    public Room(Walls rightWall, Walls leftWall, Walls frontWall, Walls backWall, Floor floor, Ceiling ceiling) {
        this.rightWall = rightWall;
        this.leftWall = leftWall;
        this.frontWall = frontWall;
        this.backWall = backWall;
        this.floor = floor;
        this.ceiling = ceiling;
    }

    public Walls getRightWall() {
        return rightWall;
    }

    public Walls getLeftWall() {
        return leftWall;
    }

    public Walls getFrontWall() {
        return frontWall;
    }

    public Walls getBackWall() {
        return backWall;
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }
}
