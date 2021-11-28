package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        String myString = "This is my string";
        System.out.println(myString);

        //Appending an integer to the string
        int myInt = 45;
        myString = myString + myInt;
        System.out.println(myString);

        //Appending a string to a string
        String new_string = ", added string";
        System.out.println(myString + new_string);


    }
}
