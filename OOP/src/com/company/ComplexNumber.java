package com.company;

public class ComplexNumber {
    private double real, imaginar;


    public ComplexNumber(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public double getReal() {
        return real;
    }

    public double getImaginar() {
        return imaginar;
    }


    public void add(double real, double imaginar){
        this.imaginar += imaginar;
        this.real += real;
    }

    public void add(ComplexNumber complexNumber){
        add(complexNumber.real, complexNumber.imaginar);
    }

    public void subtract(double real, double imaginar){
        this.real -= real;
        this.imaginar -= imaginar;
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.real,complexNumber.imaginar);
    }
}
