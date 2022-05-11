package com.company.lastdigitcheker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a) || !isValid(b) || !isValid(c)){
            System.out.println("a");
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        return lastA == lastB || lastA == lastC || lastB == lastC;
    }

    public static boolean isValid(int b){
        return b >= 10 && b <= 1000;
    }
}
