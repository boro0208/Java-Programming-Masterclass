package com.company.banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean listCustomers(String name, boolean transaction){
        if (findBranch(name) != null){
            System.out.println("Customer details for branch "+ name);
            for (Branch branch: this.branches) {
                if (transaction){
                    for(int i =0; i < branch.getCustomers().size(); i++){
                        int a = i + 1;
                        System.out.println("Customer: "+ branch.getCustomers().get(i).getName() +"["+a+"]");
                        System.out.println("Transactions");
                        for (int e = 0; e < branch.getCustomers().get(i).getTransactions().size(); e++){
                            int s = e + 1;
                            System.out.println("["+s+"]  Amount "+branch.getCustomers().get(i).getTransactions().get(e));
                        }
                    }
                }else{
                    for(int i =0; i < branch.getCustomers().size(); i++){
                        int a = i + 1;
                        System.out.println("Customer: "+ branch.getCustomers().get(i).getName() +"["+a+"]");
                    }
                }
            }
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name1, String name2, double transaction){
        if (findBranch(name1) != null){
            return findBranch(name1).addCustomerTransaction(name2, transaction);
        }
        return false;
    }

    public boolean addCustomer(String name1, String name2, double transaction){
        if (findBranch(name1) != null){
            return findBranch(name1).newCustomer(name2, transaction);
        }
        return false;
    }

    public boolean addBranch(String name){
        if (findBranch(name) == null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    private Branch findBranch(String name){
        for (Branch branch: this.branches) {
            if (branch.getName().equals(name)){
                return branch;
            }
        }

        return null;
    }
}
