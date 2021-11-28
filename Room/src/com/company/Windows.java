package com.company;

public class Windows {

    private int length;
    private int width;
    private String material;

    public Windows(int length, int width, String material) {
        this.length = length;
        this.width = width;
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }
}
