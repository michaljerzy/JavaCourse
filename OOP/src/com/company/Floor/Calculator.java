package com.company.Floor;

import com.company.Floor.Carpet;
import com.company.Floor.Floor;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
