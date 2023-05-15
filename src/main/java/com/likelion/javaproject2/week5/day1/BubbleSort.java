package com.likelion.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
