package com.company;

public class Main {

    public static void main(String[] args) {

        /*int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75 );
         */

        //calcFeetAndCentimeters.clacFeetAndInchesToCentimeters(-1, 25);
        //calcFeetAndCentimeters.clacFeetAndInchesToCentimeters(12);
        //System.out.println(calcMinutesAndSeconds.getDurationString(50));
        //System.out.println(calArea.area(-1,4));
        //System.out.println(calDayMonthYear.printYearAndDays(2000));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "scored" + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unname player scored " + score + " points");
        return score * 1000;
    }
}
