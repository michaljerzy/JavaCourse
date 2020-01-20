package com.company;

public class VipPerson {

    private  String Name;
    private  double CreditLimits;
    private  String customerEmail;


    public VipPerson(){
        this("Defalut Name", 50000.00 , "defalut@gmail.com");
    }

    public VipPerson(String name, double creditLimits){
        this(name, creditLimits, "unknown@gmail.com");
    }

    public VipPerson(String number, double creditLimits, String customerEmail) {
        this.Name = number;
        this.CreditLimits = creditLimits;
        this.customerEmail = customerEmail;
    }


    public String getName() {
        return Name;
    }

    public double getCreditLimits() {
        return CreditLimits;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
