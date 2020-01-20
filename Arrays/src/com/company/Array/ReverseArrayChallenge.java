package com.company.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int [] array = {1 , 2 , 3 ,7, 10 ,6 ,9};
        System.out.println("Array = " + Arrays.toString(array));

        reverseArray(array);

        System.out.println("Reversed array = " + Arrays.toString(array) );


    }


    private static void reverseArray(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length /2;
        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
