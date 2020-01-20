package com.company.Array;

import java.util.Scanner;

public class MinimumElementChallenge {


    private static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i = 0; i<array.length; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;

    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;

        for (int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        System.out.println("Enter count ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int retunedMin = findMin(returnedArray);
        System.out.println("Returned min value: " + retunedMin);

    }
}
