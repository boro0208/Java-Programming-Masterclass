package com.company.equalityprinter;

public class IntEqualityPrinter {
    public static void printEqual(int p1, int p2, int p3){
        if(p1 > -1 && p2 > -1 && p3 > -1){
            if(p1 == p2 && p2 == p3){
                System.out.println("All numbers are equal");
            }else if(p1 != p2 && p2 != p3 && p1 != p3){
                System.out.println("All numbers are different");
            }else{
                System.out.println("Neither all are equal or different");
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
