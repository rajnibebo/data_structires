package com.rajni.sorting;

public class Sort {

    private Sort() {

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
