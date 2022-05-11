package com.company.speedconverter;

public class SpeedConverter{
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour > -1){
            return Math.round(kilometersPerHour / 1.609344);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour > -1){
            long miles = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour+" km/h = "+miles+" mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
