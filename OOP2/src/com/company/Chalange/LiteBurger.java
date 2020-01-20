package com.company.Chalange;

public class LiteBurger extends Burger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public LiteBurger(String name, String meal, double price) {
        super("LiteBurger", meal, price);
    }

    public void addHamburgerAddition1(double price, String name){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHamburgerAddition2(double price, String name){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if(healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if(healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        return hamburgerPrice;
    }
}
