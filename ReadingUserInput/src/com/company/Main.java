package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create a new scanner object
        Scanner scanner = new Scanner(System.in);

        //checking if the input is valid
        System.out.println("Enter your birth year:");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine(); //Handling the Enter Key

            System.out.println("Enter your Name:");
            String name = scanner.nextLine();
            int age = 2020 - birthYear;

            if (age >= 0 && age <= 100)
                System.out.println("Your name is " + name + " and your age is " + age + " years old.");
            else
                System.out.println("Invalid Birth Year");
        } else
            System.out.println("Unable to parse birth year");

        scanner.close();


    }
}
