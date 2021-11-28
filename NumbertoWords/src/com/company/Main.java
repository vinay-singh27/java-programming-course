package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWords(10);
    }

    public static int getDigitCount(int a) {
        return String.valueOf(a).length();
    }

    public static int reverse(int a) {
        int reverse = 0;
        int sign = (a > 0) ? 1 : -1;
        a = Math.abs(a);
        while(a >= 1 ) {
            reverse = (reverse * 10) + a % 10;
            a /= 10;
        }
        return sign * reverse;
    }

    public static void numberToWords(int a) {

        if (a < 0)
            System.out.println("Invalid Value");
        else {
            int new_a = reverse(a);
            new_a = reverse(new_a);
            String result = "";
            while(new_a >= 1) {
                int unit = new_a % 10;
                new_a /= 10;
                switch(unit){
                        case 0 :
                            result = result + "Zero ";
                            break;
                        case 1 :
                            result = result + "One ";
                            break;
                        case 2 :
                            result = result + "Two ";
                            break;
                        case 3 :
                            result = result + "Three ";
                            break;
                        case 4:
                            result = result + "Four ";
                            break;
                        case 5 :
                            result = result + "Five ";
                            break;
                        case 6 :
                            result = result + "Six ";
                            break;
                        case 7 :
                            result = result + "Seven ";
                            break;
                        case 8 :
                            result = result + "Eight ";
                            break;
                        case 9 :
                            result = result + "Nine ";
                            break;
                    }
            }
            int diff = getDigitCount(a) - getDigitCount(reverse(a));
            for (int i = diff; i != 0; i--)
                    result = result + "Zero ";

            System.out.println(result.trim());
        }
    }
}
