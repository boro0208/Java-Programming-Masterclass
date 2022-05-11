package com.company.firstandlastdigitsum;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int sum = 0;
        sum = number % 10;
        while (number > 0){
            int a = number % 10;
            number = number / 10;
            if(number == 0 ){
                sum += a;
            }
        }
        return sum;
    }
}
