package com.company;

public class FlourPack {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int big = 5, small = 1;

        bigCount *= big;
        smallCount *= small;
        if(bigCount + smallCount == goal)
            return true;
        else
            return false;
    }
}
