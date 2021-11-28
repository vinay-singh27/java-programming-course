package com.company;

public class Main {

    public static void main(String[] args) {
        timeConversion(87, 33);
        timeConversion(960);
    }

    public static void timeConversion(int minutes, int seconds) {
        if (minutes >= 0 & (seconds >= 0 && seconds <= 60)) {
            int hour = minutes / 60;
            minutes %= 60;
            System.out.println(hour + "h " + minutes + "m " + seconds + "s");
        }
        else
            System.out.println("Invalid Value");
    }
    public static void timeConversion(int seconds) {
        if ((seconds >= 0)) {
            int minutes = seconds / 60;
            seconds %= 60;
            timeConversion(minutes, seconds);
        }
        else
            System.out.println("Invalid Value");
    }

}
