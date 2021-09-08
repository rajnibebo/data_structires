package com.rajni.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(intArray, 0, 10 );
        System.out.println(Arrays.toString(intArray));
    }

    public static void countingSort(int[] intArray, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < intArray.length; i++) {
            countArray[intArray[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++) {
            while(countArray[i-min] > 0) {
                intArray[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
