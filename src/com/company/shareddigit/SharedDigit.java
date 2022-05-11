package com.company.shareddigit;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        int initial = b;
        boolean bool;
        if(a < 10 || a > 99 || b < 10 || b > 99){
            return false;
        }
        do{
            int c = a % 10;
            a /= 10;
            do{
                int dig = b % 10;
                b /= 10;
                System.out.println(c+" == "+dig);
                bool = c == dig;
                if(bool){
                    return true;
                }
            }while(b > 0);
            b = initial;
        }while(a > 0);

        return bool;
    }
}
