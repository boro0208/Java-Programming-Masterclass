package com.company.minutestoyear;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes > -1){
            int hours = (int)minutes / 60;
            int days = hours / 24;
            int years = days / 365;
            days = days % 365;
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
