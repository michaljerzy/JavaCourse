package com.company.House;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRaing;

    public Lamp(String style, boolean battery, int globRaing) {
        this.style = style;
        this.battery = battery;
        this.globRaing = globRaing;
    }

    public void turnOn(){
        System.out.println("Lamp -> turn on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRaing() {
        return globRaing;
    }
}
