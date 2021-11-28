package com.company;

public class Floor {

    private int length;
    private int width;
    private Tiles tiles;

    public Floor(int length, int width, Tiles tiles) {
        this.length = length;
        this.width = width;
        this.tiles = tiles;
    }
    public void numOfTiles() {
        double areaOfEachTile = tiles.getLength() * tiles.getWidth();
        double areaOfFloor = this.length * this.width;
        double numOfTiles = Math.ceil(areaOfFloor/areaOfEachTile);
        System.out.println("Number of Tiles present are: " + numOfTiles);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Tiles getTiles() {
        return tiles;
    }
}
