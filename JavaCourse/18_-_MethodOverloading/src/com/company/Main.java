package com.company;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Fernando", 500);
//        System.out.println("New score is: " + newScore);
//        calculateScore(75);
//        calculateScore();
//        calcFeetAndInchesToCentimeters(6, 0);
//        calcFeetAndInchesToCentimeters(7, 5);
//        calcFeetAndInchesToCentimeters(6, -10);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (!(feet >= 0) || !(inches >= 0 && inches <= 12)) {
            System.out.println("Invalid parameters");
            return -1;
        }
        double feetToCentimeters = feet * 30.48d;
        double inchesToCentimeters = inches * 2.54d;
        System.out.println(feet + " FT = " + feetToCentimeters + " cm and " +
                inches + " in = " + inchesToCentimeters + " cm");
        return feetToCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (!(inches >= 0)) {
            return -1;
        }
        double feetInInches = inches / 12d;
        double remainingInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feetInInches, remainingInches);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
