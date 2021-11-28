package com.company;

public class Main {

    public static void main(String[] args) {
        int new_number = palindrome(-222);
        System.out.println(new_number);
    }

    public static int palindrome(int number) {
        number = Math.abs(number);
        int remainder = 0;
        int new_num = 0;
        while(number > 0) {
            remainder = number % 10;
            number /= 10;
            new_num = (new_num * 10) + remainder;
        }
        return new_num;
    }
}
