package com.company;

public class PC {

    private Casing theCase;
    private Motherboard theMotherboard;
    private Monitor monitor;

    public PC(Casing theCase, Motherboard theMotherboard, Monitor monitor) {
        this.theCase = theCase;
        this.theMotherboard = theMotherboard;
        this.monitor = monitor;
    }

    public Casing getTheCase() {
        return theCase;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
