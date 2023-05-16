package com.likelion.javaproject2.week5.day2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            int value = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (value > arr[j]) {
                    idx = j;
                    value = arr[j];
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
