package com.company.billsburgers;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healty Burger", meat, price, "Brown");
    }

    public void addHealthyAddition1(String name , double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        System.out.println("Added "+healthyExtra1Name+" for an extra "+ healthyExtra1Price);
    }

    public void addHealthyAddition2(String name , double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        System.out.println("Added "+healthyExtra2Name+" for an extra "+ healthyExtra2Price);
    }
    public double itemizeHamburger() {
        double price = 0.0;
        price += healthyExtra1Price;
        price += healthyExtra2Price;
        return (super.itemizeHamburger() + price);
    }
}
