package com.company.minimumelement;

import java.util.Scanner;

public class MinimumElement {

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How meany elements you need? \r");
        return scanner.nextInt();
    }

    public static int[] readElements(int number){
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert elements \r");
        for (int i = 0; i<number; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int num = array[0];

        for (int i = 0; i < array.length; i++){
            if (num > array[i]){
                num = array[i];
            }
        }
        return num;
    }
}
