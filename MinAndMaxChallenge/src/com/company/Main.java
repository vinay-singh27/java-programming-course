package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            boolean hasInt = scanner.hasNextInt();
            if(hasInt) {
                int num = scanner.nextInt();
                min = (num < min) ? num : min;
                max = (num > max) ? num : max;
            }
            else
                break;

            scanner.nextLine();
        }
        System.out.println("Min : " + min + " And Max : " + max);
        scanner.close();
    }
}
