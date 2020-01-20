package com.company;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitalSum(252));
    }

    public static int getEvenDigitalSum(int number){
        int value = 0;
        if(number<0)
            return -1;
        while (number>0){
            if((number%10) % 2 == 0){
                value = value + number % 10;
            }
            number /= 10;
        }
        return value;
    }
}
