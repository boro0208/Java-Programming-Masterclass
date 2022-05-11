package com.company.inputcalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;
        int counter = 0;
        while(true){
            boolean isInt = scanner.hasNextInt();

            if (isInt){
                counter++;
                input = scanner.nextInt();
                sum += input;
                scanner.nextLine();
                System.out.println(sum);
            }else{
                break;
            }
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round((double) sum/counter));

        scanner.close();
    }
}
