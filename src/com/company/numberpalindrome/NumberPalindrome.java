package com.company.numberpalindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int initial = number;
        if (initial < 0){
            initial = initial * -1;
            number = number * -1;

        }
        int reverse = 0;
        while(number>0){
            int lastDigit = number % 10;
            number = number / 10;
            reverse += lastDigit;
            if(number != 0){
                reverse = reverse * 10;
            }
        }
        if(initial == reverse){
            return true;
        }else{
            return false;
        }
    }
}
