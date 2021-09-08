package com.rajni.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid); // left array partitioning
        mergeSort(input, mid, end);  // right array partitioning
        merge(input, start, mid, end);
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        //Optimization - no need to merge, all arrays are already sorted.
        if(inputArray[mid - 1] <= inputArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;  // right array starting
        int tempIndex = 0;

        int temp[] = new int[end - start];

        while(i < mid && j <end) {
            temp[tempIndex++] = (inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++]);
        }

        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid-i);// will only handle left array
        System.arraycopy(temp, 0, inputArray, start, tempIndex);

    }
}
