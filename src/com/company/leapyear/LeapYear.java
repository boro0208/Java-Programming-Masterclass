package com.company.leapyear;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(9999 >= year && year >= 1){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
