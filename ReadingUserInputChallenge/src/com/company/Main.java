package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(count <=10) {
            System.out.println("Enter the #" + count + " number:");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt) {
                int num = scanner.nextInt();
                sum += num;
                count += 1;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of the 10 Valid Numbers: " + sum);
    }

}
