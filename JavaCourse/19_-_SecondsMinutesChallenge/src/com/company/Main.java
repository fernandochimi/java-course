package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static String getDurationString(int minutes, int seconds) {
        if (!(minutes >= 0) || !(seconds >= 0 && seconds <= 59)) {
            return "Invalid Value";
        }
        return "";
    }
}
