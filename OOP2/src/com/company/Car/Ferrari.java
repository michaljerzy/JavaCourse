package com.company.Car;

public class Ferrari extends Car{
    public Ferrari() {
        super("Ferrari 511", 4, 12, 780, 7);
    }

    @Override
    public String like() {
        return "Yes";
    }
}
