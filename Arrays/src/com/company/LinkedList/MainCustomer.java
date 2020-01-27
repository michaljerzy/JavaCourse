package com.company.LinkedList;

import java.util.ArrayList;

public class MainCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.58);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(11);

        for(int i = 0; i <intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
