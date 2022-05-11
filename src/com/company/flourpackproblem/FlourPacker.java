package com.company.flourpackproblem;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int rest = goal % 5;
        int big = goal / 5;
        if ((bigCount * 5) + smallCount >= goal){
            System.out.println(goal+" < "+(bigCount * 5)+" && "+goal+" > "+ smallCount);
            if (goal < (bigCount * 5) && goal > smallCount) {
                if (big < bigCount && rest <= smallCount){
                    return true;
                }
                return false;
            }else{
                if (big > bigCount && rest > smallCount) {
                    return false;
                } else {
                    return true;
                }
            }
        }else{
            return false;
        }
    }
}
