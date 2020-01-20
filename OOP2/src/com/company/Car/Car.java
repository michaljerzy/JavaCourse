package com.company.Car;

public class Car {
    private String name;
    private int wheels;
    private int cylinders;
    private int power;
    private int engineCapacity;

    public Car(String name, int wheels, int cylinders, int power, int engineCapacity) {
        this.name = name;
        this.wheels = wheels;
        this.cylinders = cylinders;
        this.power = power;
        this.engineCapacity = engineCapacity;
    }
    public String like(){
        return "I don't know";
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getPower() {
        return power;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }


    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();

        System.out.println(ferrari.like());
    }

}






