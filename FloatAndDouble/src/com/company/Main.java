package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Minimum Float Value is " + myMinFloat);
        System.out.println("Maximum Float Value is " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Minimum Double Value is " + myMinDouble);
        System.out.println("Maximum Double Value is " + myMaxDouble);

        int myInt = 5/3;
        float myFloat =  5f/3f;
        double myDouble = 5d/3d;

        System.out.println("Integer : " + myInt);
        System.out.println("Float : " + myFloat);
        System.out.println("Double : " + myDouble);

        //Pounds to Kilogram Conversion

        double pounds = 2;
        double kilograms = pounds * 0.453592;
        System.out.println("Kilograms : " + kilograms);
    }
}
