package com.company;

import java.io.Console;

public class RozszerzonyNWD {

    public static void main(String[] args) {

        System.out.println(NWD(15, 13));

    }

    public static int NWD(int a, int b)
    {
        if(b > a)
            return -1;
        int t;
        do{
            t = (a - (a/b)*b);
            a = b;
            b = t;
        } while (b != 0);
        return a;
    }



}
