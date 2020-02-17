package com.company;

public class Main {

    public static void main(String[] args) {

        DeskPhone timsPhone;
        timsPhone = new DeskPhone(1234);
        //timsPhone.powerOn();
        timsPhone.callPhone(1234);
        timsPhone.answer();


        MobilePhone mobilePhone;
        mobilePhone = new MobilePhone(323232);
        mobilePhone.powerOn();
        mobilePhone.callPhone(323232);
        mobilePhone.answer();
    }
}
