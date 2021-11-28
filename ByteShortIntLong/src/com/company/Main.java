package com.company;

public class Main {

    public static void main(String[] args) {

        int myInt = 1000;

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Maximum Integer is " + maxInt);
        System.out.println("Minimum Integer is "+ minInt);
        System.out.println("Busted Maximum Integer is " + (maxInt + 1));
        System.out.println("Busted Minimum Integer is " + (minInt - 1));

        byte myMaxByte = Byte.MAX_VALUE;
        byte myMinByte = Byte.MIN_VALUE;
        System.out.println("Maximum Byte is " + myMaxByte);
        System.out.println("Minimum Byte is " + myMinByte);

        short myMaxShort = Short.MAX_VALUE;
        short myMinShort = Short.MIN_VALUE;
        System.out.println("Maximum Short is " + myMaxShort);
        System.out.println("Minimum Short is " + myMinShort);

        long myLongInt = 100;
        long myMaxLong = Long.MAX_VALUE;
        long myMinLong = Long.MIN_VALUE;
        System.out.println("Maximum Long is " + myMaxLong);
        System.out.println("Minimum Long is " + myMinLong);

        long myLongNumber = 2147483648L;
        System.out.println("Long Number is : " + myLongNumber);

        //Cast

        int myTotal = myInt/2;

        short myShort = (short) (myMinShort/2);

        byte myByte = (byte) (myMinByte/2);

        //Challenge Part

        byte newByte = 45;
        short newShort = 4528;
        int newInt = 845795;
        long newLong = 50000 + 10 * (newByte + newShort + newInt);
        System.out.println("Final Long Number is " + newLong);



    }
}
