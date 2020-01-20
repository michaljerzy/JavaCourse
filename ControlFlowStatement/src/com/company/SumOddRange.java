package com.company;

public class SumOddRange {

    public static void main(String[] args) {
        sumOdd(100);
    }

    public static void sumOdd(int number)
    {
        int start = 0;
        int p = 2;
        boolean t = true;
        while(start < number)
        {
            for(int i = 2; i < p; i ++){
                if(p % i == 0){
                    t = false;
                    break;
                }
                if(t){
                    System.out.println(p);
                }
            }
        }

    }

}
