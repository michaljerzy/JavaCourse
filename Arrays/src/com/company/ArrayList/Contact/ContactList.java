package com.company.ArrayList.Contact;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<String> contactList = new ArrayList<String>();
    private ArrayList<String> nameList = new ArrayList<String>();

    public void addContact(String number){
        contactList.add(number);
    }
    public void addName(String name){
        nameList.add(name);
    }

    private void modifyContactList(int position, String newItem){
        contactList.set(position, newItem);
        System.out.println("Contact item " + (position + 1) + " has been modified.");
    }


    public void modifyContactList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyContactList(position, newItem);
        }
    }

    private void modifyNameList(int position, String newItem){
        nameList.set(position, newItem);
        System.out.println("Contact item " + (position + 1) + " has been modified.");
    }

    public void modifyNameList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyNameList(position, newItem);
        }
    }

    private void removeContactItem(int position){
        contactList.remove(position);
    }

    public void removeContactItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeContactItem(position);
        }
    }

    public void printContact(){
        if(contactList.size()==nameList.size()) {

            System.out.println("You have " + contactList.size() + " in your contact list.");
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(nameList.get(i) + " : " + contactList.get(i));
            }
        }else
            System.out.println("Error");
    }

    private int findItem(String position){
        return contactList.indexOf(contactList);
    }


}
