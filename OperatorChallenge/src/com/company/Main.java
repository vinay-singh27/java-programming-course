package com.company;

public class Main {

    public static void main(String[] args) {

        double a = 20.00;
        double b = 80.00;
        double c = (a + b) * 100.00;
        double remainder = c % 40.00;
        boolean isRemainder = remainder == 0 ? true : false;
        System.out.println(isRemainder);
        if (!isRemainder)
            System.out.println("Got some remainder");

    }
}
