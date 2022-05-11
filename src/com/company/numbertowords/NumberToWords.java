package com.company.numbertowords;

public class NumberToWords {
    public static void numberToWords(int number){
        int init = getDigitCount(number);
        if (number < 0){
            System.out.println("Invalid Value");
        }
        number = reverse(number);
        int num = getDigitCount(number);


        do{
            int digit = number % 10;
            number /= 10;
            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }while (number > 0);
        if (num < init){
            int diff = init - num;
            for (int i = 0; i < diff; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int negative;
        if(number < 0){
            negative = -1;
            number *= -1;
        }else{
            negative = 1;
        }
        int num = 0;

        while(number > 0){
            num += number % 10;
            number /= 10;
            if (number != 0){
                num *= 10;
            }
        }
        return (num * negative);
    }

    public static int getDigitCount(int number){
        if(number < 0)
            return -1;
        int i = 0;
        do{
            number /= 10;
            i++;
        }while(number > 0);
        return i;
    }
}
