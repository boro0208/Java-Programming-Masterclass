package com.company.banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }

//    public void printTransaction(){
//        System.out.println("Transactions");
//        for(int i = 0; i < this.transactions.size(); i++){
//            int a = i + 1;
//            System.out.println("["+a+"]  Amount "+transactions.get(i));
//        }
//    }
}
