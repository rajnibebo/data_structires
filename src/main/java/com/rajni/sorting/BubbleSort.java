package com.rajni.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20, -15, 7, 35, 55, 1, -22};

        int unsortedPartitionIndex = intArray.length - 1;
        for (int index = unsortedPartitionIndex; unsortedPartitionIndex > 0 ; unsortedPartitionIndex--) {
            for(int j = 0; j < index; j++) {
                if(intArray[j] > intArray[j+1]) {
                    swap(intArray, j, j+1);
                }
            }
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j ) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
