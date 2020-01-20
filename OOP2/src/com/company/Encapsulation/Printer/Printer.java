package com.company.Encapsulation.Printer;

public class Printer {
    private int tonerLevel;
    private int quantityPage;
    //private String printerName;
    private int pagePrintet;

    public Printer(int tonerLevel, int quantityPage, int pagePrintet) {
        this.tonerLevel = tonerLevel;
        this.quantityPage = quantityPage;
        this.pagePrintet = pagePrintet;
    }

    public void getToner(){
        if(this.tonerLevel >100 && this.tonerLevel <= 0){
            System.out.println("Replace toner!");
        }
        double tonerDamage;
        tonerDamage = tonerLevel - pagePrintet*0.02;
        System.out.println("Quantity of toner = " + tonerDamage);
    }

    public void getPage(){
        this.quantityPage -= this.pagePrintet;
        if(quantityPage <= 0){
            System.out.println("Quantity od pages is 0");
        }else
            System.out.println(quantityPage + " pages left");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getQuantityPage() {
        return quantityPage;
    }


    public int getPagePrintet() {
        return pagePrintet;
    }
}
