package com.company;

import com.company.Chalange.Burger;
import com.company.Encapsulation.Player.EnhancedPlayer;
import com.company.Encapsulation.Printer.Printer;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("Zajebisty", "Wołowina", 6.60);
        burger.addHamburgerAddition1("Po chuju dojebać mięsa fest", 2.50);
        System.out.println("Total Burger price is: " + burger.itemizeHamburger());
    }
}
