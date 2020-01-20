package com.company.Array;

import java.util.Arrays;

public class TypesvsValuesTypes {


    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change AnotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {1, 2 ,3 ,4 ,5};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify AnotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array){

        array[0] = 2;
    }

}
