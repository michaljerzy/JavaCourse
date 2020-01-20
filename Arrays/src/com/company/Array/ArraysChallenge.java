package com.company.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getNumber(5);
        Arrays.sort(myIntegers);
        printArray(myIntegers);

    }

    public static int[] getNumber(int number){
        int[] values = new int[number];
        System.out.println("Enter" + number + " integer values");
        for(int i=0; i<values.length; i++ ){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values){
        for(int i = 0; i < values.length; i++){
            System.out.println("Element " + i + " , typed value is " + values[i]);
        }
    }

}
