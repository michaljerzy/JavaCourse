package com.company.Floor;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double lenght) {
        if(width<=0 || lenght <= 0){
            this.width = 0.0;
            this.length = 0.0;
        }else {
            this.width = width;
            this.length = lenght;
        }

    }
    public double getArea(){
        return this.length * this.width;
    }
}
