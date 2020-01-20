package com.company;

public class calcMinutesAndSeconds {
    public static String getDurationString(double minute, double secound){
        if(minute<=0 || secound<=0 || secound > 59){
            return "Invalid values";
        }
           double hours = minute/60;
           double remaingMinutes = minute % 60;
           return hours + " h, " + remaingMinutes + " m, " + secound + " s";
    }
    public static String getDurationString(double secound){
        if(secound < 0)
            return "Invalid value";

        double minute = secound/60;
        double remaingMinutes = secound % 60;
        return getDurationString(minute, remaingMinutes);
    }

}
