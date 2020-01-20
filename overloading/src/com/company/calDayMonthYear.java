package com.company;

public class calDayMonthYear {
    public static void printYearAndDays(double minutes)
    {
        if(minutes > 0)
        {
            System.out.println("Invalid Value");
        }
        double hour = minutes / 60;
        double remaingMinutes = minutes % 60;
        double day = hour / 24;
        double year = day / 360;

        System.out.println("minuty: " + remaingMinutes + "godziny: " + hour + "dni: " + day + "lata: " + year );
    }

    public static void main(String[] args) {
        printYearAndDays(535600);
    }
}
