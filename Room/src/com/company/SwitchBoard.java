package com.company;

public class SwitchBoard {

    private int numOfFanSwitch;
    private int numOfBulbSwitch;

    public SwitchBoard(int numOfFanSwitch, int numOfBulbSwitch) {
        this.numOfFanSwitch = numOfFanSwitch;
        this.numOfBulbSwitch = numOfBulbSwitch;
    }
    public void fanSwitch(String condition) {
            System.out.println("Fan is turned " + condition);
    }
    public void bulbSwitch(String condition) {
        System.out.println("Bulb is turned " + condition);
    }

    public int getNumOfFanSwitch() {
        return numOfFanSwitch;
    }

    public int getNumOfBulbSwitch() {
        return numOfBulbSwitch;
    }
}
