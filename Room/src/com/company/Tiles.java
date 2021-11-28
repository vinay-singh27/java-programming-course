package com.company;

public class Tiles {

    private int length;
    private int width;
    private String pattern;

    public Tiles(int length, int width, String pattern) {
        this.length = length;
        this.width = width;
        this.pattern = pattern;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getPattern() {
        return pattern;
    }
}
