package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double secoundNumber;


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecoundNumber() {
        return secoundNumber;
    }

    public void setSecoundNumber(double secoundNumber) {
        this.secoundNumber = secoundNumber;
    }

    public double getAdditionResult() {
        return firstNumber+secoundNumber;
    }

    public double getSubtractionResult() {
        return firstNumber-secoundNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber*secoundNumber;
    }

    public double getDivisionResult() {
        if(secoundNumber==0)
            return -1;
        return firstNumber/secoundNumber;
    }
}
