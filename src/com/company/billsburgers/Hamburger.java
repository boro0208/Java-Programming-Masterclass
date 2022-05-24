package com.company.billsburgers;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name , double price){
        addition1Price = price;
        addition1Name = name;
        System.out.println("Added "+addition1Name+" for an extra "+ addition1Price);
    }

    public void addHamburgerAddition2(String name , double price){
        addition2Price = price;
        addition2Name = name;
        System.out.println("Added "+addition2Name+" for an extra "+ addition2Price);
    }

    public void addHamburgerAddition3(String name , double price){
        addition3Price = price;
        addition3Name = name;
        System.out.println("Added "+addition3Name+" for an extra "+ addition3Price);
    }

    public void addHamburgerAddition4(String name , double price){
        addition4Price = price;
        addition4Name = name;
        System.out.println("Added "+addition4Name+" for an extra "+ addition4Price);
    }

    public double itemizeHamburger(){
        this.price += addition1Price;
        this.price += addition2Price;
        this.price += addition3Price;
        this.price += addition4Price;

        return this.price;
    }
}
