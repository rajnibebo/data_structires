package com.rajni.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray =  {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int largest = 0;
            for(int j = 1; j <= lastUnsortedIndex; j++) {
                if(intArray[j] > intArray[largest]) {
                    largest = j;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);

        }
        System.out.println(Arrays.toString(intArray));

    }

    public static void swap(int[] array, int i, int j) {
        if(i == j)
            return;

        int temp = array[i];

        array[i] = array[j];
        array[j] = temp;
    }
}
