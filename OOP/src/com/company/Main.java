package com.company;

import com.company.Cylinder.Circle;
import com.company.Cylinder.Cylinder;
import com.company.Floor.Calculator;
import com.company.Floor.Carpet;
import com.company.Floor.Floor;
import com.company.Inheritance.Animal;
import com.company.Inheritance.Dog;
import com.company.Inheritance.Fish;
import com.company.PoolArea.Cuboid;
import com.company.PoolArea.Rectangle;
import com.company.Vehicle.Outlander;

public class Main {

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(5 ,10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.area = " + cuboid.getArea());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());


    }
}
