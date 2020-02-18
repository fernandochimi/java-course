package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + highScore);

        // Challenge
        int calcHighScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Carol", calcHighScore);

        calcHighScore = calculateHighScorePosition(900);
        displayHighScorePosition("Fer", calcHighScore);

        calcHighScore = calculateHighScorePosition(400);
        displayHighScorePosition("Nego", calcHighScore);

        calcHighScore = calculateHighScorePosition(50);
        displayHighScorePosition("Nega", calcHighScore);

        calcHighScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Jao", calcHighScore);

        calcHighScore = calculateHighScorePosition(500);
        displayHighScorePosition("Ze", calcHighScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
