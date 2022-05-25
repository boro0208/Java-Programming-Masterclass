package com.company.sortedarray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number){
       int[] array = new int[number];
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insert numbers: \r");

       for (int i = 0; i < number; i++){
           array[i] = scanner.nextInt();
       }
       return array;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean condition = true;
        int temp;

        while (condition){
            condition = false;
            for (int i=0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    condition = true;
                }
            }
        }

        return sortedArray;
    }
    public static int[] sortIntegersASC(int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean condition = true;
        int temp;

        while (condition){
            condition = false;
            for (int i=0; i < sortedArray.length-1; i++){
                if (sortedArray[i] > sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    condition = true;
                }
            }
        }

        return sortedArray;
    }

}
