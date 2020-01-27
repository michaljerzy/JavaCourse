package com.company.ArrayList.PhoneHouse;

import java.util.ArrayList;

public class PhoneHouse {

    private ArrayList<String> number = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();

    public PhoneHouse(ArrayList<String> number, ArrayList<String> name) {
        this.number = number;
        this.name = name;
    }

    public void addContact(String addNumber, String addName){
        number.add(addNumber);
        name.add(addName);
    }

    public int selectName(String searchName){
        return name.indexOf(searchName);
    }

    public int selectNumber(String searchNumber){
        return number.indexOf(searchNumber);
    }

    public void printContact(){
        System.out.println("You have " + number.size() + " contact in your phone.");
        for(int i = 0; i < number.size(); i++){
            System.out.println((i+1)+".Name: " + name.get(i) + "  number: " + number.get(i));
        }
    }
}
