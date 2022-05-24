package com.company.billsburgers;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe hamburger", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    public void addHamburgerAddition1(String name , double price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    public void addHamburgerAddition2(String name , double price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    public void addHamburgerAddition3(String name , double price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    public void addHamburgerAddition4(String name , double price){
        System.out.println("No additional items can be added to a deluxe burger.");
    }
}
