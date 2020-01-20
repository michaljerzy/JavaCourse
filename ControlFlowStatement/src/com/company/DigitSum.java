package com.company;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int number){
        int lastDigit ,temp, reverse = 0;

        temp = number;
        while(number != 0){
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        if(temp==number)
            return true;
        else
            return false;
    }
}
