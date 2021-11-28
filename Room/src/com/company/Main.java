package com.company;

public class Main {

    public static void main(String[] args) {

        Walls rightWall = new Walls(40,60,"Green", new SwitchBoard(2,4),
                new Windows(8,12, "Glass"));

        Walls leftWall = new Walls(40,60,"Green", new SwitchBoard(0,0),
                new Windows(8,12, "Glass"));
    }
}
