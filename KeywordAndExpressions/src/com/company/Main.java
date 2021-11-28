package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 5 + 78; // a = 5 + 78 is an expression and the complete line is statement

        boolean gameOver = false;
        int score = 4300;
        int levelCompleted = 5;
        int bonus = 100;

//        if (gameOver && score > 4500) {
//            System.out.println("You will get bonus");
//            System.out.println("Your Score is " + (score + bonus));
//        }
//        else if (gameOver && score < 4500) {
//            System.out.println("You will not get bonus");
//            System.out.println("Your score is " + score);
//        }
//        else {
//            System.out.println("Game is not over");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);

        }


    }
}
