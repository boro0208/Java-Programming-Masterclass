package com.company.barkingdog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay > -1 && hourOfDay < 24){
            if (barking && hourOfDay < 8 || hourOfDay > 22){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
