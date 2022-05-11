package com.company.teennumberchecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int p1, int p2, int p3){
        if(isTeen(p1) || isTeen(p2) || isTeen(p3))
            return true;

        return false;
    }

    public static boolean isTeen(int param){
        if((19 >= param && param >= 13)){
            return true;
        }
        return false;
    }
}
