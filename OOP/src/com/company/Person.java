package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        if(age < 0 || age > 100)
            return 0;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen(){
        if(age < 12 || age < 20){
            return false;
        }else {
            return true;
        }
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty())
        {
            return "";
        }
        if(firstName.isEmpty())
        {
            return lastName;
        }
        if(lastName.isEmpty())
        {
            return firstName;
        }
        return firstName + " " + lastName;
    }

}
