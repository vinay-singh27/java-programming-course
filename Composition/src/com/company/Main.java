package com.company;

public class Main {

    public static void main(String[] args) {

        Casing theCase = new Casing("220B", "Dell", "240 Watt",
                new Dimensions(20,20,5));
        Monitor theMonitor = new Monitor("theBeast", "Asus",
                36, new Resolution(2400, 1900) );
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMotherboard, theMonitor);

        thePC.getMonitor().drawPixel(22,65,"red");
        thePC.getTheCase().pressPowerButton();
        thePC.getTheMotherboard().loadProgram("Super Mario");
    }
}
