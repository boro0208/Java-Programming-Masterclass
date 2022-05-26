package com.company.reversearray;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        int a = 0;
        for (int i = array.length-1; i >= 0 ; i--){
            reversedArray[a] = array[i];
            a++;
        }

        System.out.println("Array = "+Arrays.toString(array));
        System.out.println("Reversed array = "+Arrays.toString(reversedArray));
    }
}
