package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 100; i <300; i++) {
            if (isPrime(i)) {
                System.out.println("Prime Number : " + i);
                count++;
                if (count > 5)
                    {System.out.println("We have found 5 Prime Number. Closing the loop");
                    break;}
            }
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest/100));
    }

    public static boolean isPrime(int number) {
        if (number ==1)
            return false;
        else{
            for(int a = 2; a <= (number/2); a++) {
                if (number % a == 0)
                    return false; }
            return true; }
    }


}
