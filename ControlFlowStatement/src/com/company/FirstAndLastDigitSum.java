package com.company;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){

        if(number<0)
            return -1;
        int firstDigit, lastDigit;
        firstDigit = number;
        lastDigit = number;
        while(firstDigit>=10){
            firstDigit /= 10;
        }

        lastDigit = number % 10;

        return lastDigit + firstDigit;

    }
}
