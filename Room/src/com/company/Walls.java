package com.company;

import java.awt.*;

public class Walls {

    private int length;
    private int width;
    private String color;
    private SwitchBoard switchBoard;
    private Windows window;

    public Walls(int length, int width, String color, SwitchBoard switchBoard, Windows window) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.switchBoard = switchBoard;
        this.window = window;
    }

    public void pressFanSwitch(String condition) {
            switchBoard.fanSwitch(condition);
    }

    public void pressBulbSwitch(String condition) {
        switchBoard.bulbSwitch(condition);
    }

    public void openWindow() {
        System.out.println("Window is open");
    }

    public Windows getWindow() {
        return window;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public SwitchBoard getSwitchBoard() {
        return switchBoard;
    }
}
