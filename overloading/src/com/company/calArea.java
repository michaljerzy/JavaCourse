package com.company;

public class calArea {
    public static double area(double radius)
    {
        if(radius<0){
            System.out.println("Invalid value");
            return -1;
        }
        return Math.pow(radius,2)*Math.PI;
    }
    public static double area(double x, double y){
        if(x <=0 || y <= 0){
            System.out.println("Invalid value");
            return -1;
        }
        return x * y;
    }

}
