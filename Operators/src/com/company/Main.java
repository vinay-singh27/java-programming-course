package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 15;
        result ++;
        System.out.println(result);
        result --;
        System.out.println(result);
        result += 10;
        System.out.println(result);
        result -= 48;
        System.out.println(result);
        result *= 8;
        System.out.println(result);

        boolean isAlienThere = false;
        if (isAlienThere == false) {
            System.out.println("There is no alien");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("Top Score is equal to 100");
        }

        int secondTopScore = 80;
        if (topScore == 100 && secondTopScore < topScore) {
            System.out.println("Top score is equal to 100");
            System.out.println("Second top score is less than top score");
        }

        if ((topScore > 90) || (topScore < secondTopScore)) {
            System.out.println("OR Condition is true");
        }

        boolean isCar = true;
        if (isCar)
            System.out.println("It is a car");

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        int age = 17;
        String permission = age > 18 ? "Yes" : "No";
        System.out.println(permission);

    }
}
