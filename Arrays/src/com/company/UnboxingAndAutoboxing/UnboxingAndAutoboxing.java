package com.company.UnboxingAndAutoboxing;

import java.util.ArrayList;

//Wrapping

public class UnboxingAndAutoboxing {
    private int myValue;

    public UnboxingAndAutoboxing(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        ArrayList<UnboxingAndAutoboxing> intClassArrayList = new ArrayList<UnboxingAndAutoboxing>();
        intClassArrayList.add(new UnboxingAndAutoboxing(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();


    }
}