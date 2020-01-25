package com.company.ArrayList.Contact;

import com.company.ArrayList.GroceryList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class MainContact {

    private static Scanner scanner = new Scanner(System.in);
    private static ContactList contactList = new ContactList();
    private static ArrayList<String> NameList = new ArrayList<String>();

    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contactList.printContact();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the number: ");
        contactList.addContact(scanner.nextLine());
        System.out.println("Please enter the name contact");
        contactList.addName(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        String itemNumber = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newItemNumber = scanner.nextLine();
        System.out.println("Enter name of this contact: ");
        String newItemName = scanner.nextLine();
        contactList.modifyList(itemNumber, newItemNumber ,newItemName);
    }

    public static void removeItem(){
        System.out.println("Enter item number: ");
        String itemNumber = scanner.nextLine();
        contactList.removeContactItem(itemNumber);
        contactList.removeNameItem(itemNumber);

    }


}
