package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        calculateScore("Ant", 700);
        calculateScore(800);
        calculateScore();

    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + "has scored " + score + " runs");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " runs");
        return score * 100;
    }

    public static void calculateScore() {
        System.out.println("No Information");
    }
}

