package com.company;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String biosName;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String biosName) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.biosName = biosName;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBiosName() {
        return biosName;
    }
}
