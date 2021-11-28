package com.company;

public class Main {

    public static void main(String[] args) {
	    double cm_1 = calcFeetAndInchesToCentimeters(5, 3);
        System.out.println(cm_1);
        double cm_2 = calcFeetAndInchesToCentimeters(169);
        System.out.println(cm_2);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            return ((feet * 12 * 2.54) + (inches * 2.54));
        }
        else return -1; }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ((inches >= 0)) {
            int feet =  (int) inches / 12;
            int inch = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inch);
        }
        else return -1; }
}
