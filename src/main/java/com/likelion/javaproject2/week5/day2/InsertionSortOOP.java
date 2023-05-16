package com.likelion.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSortOOP {
    public int[] sort(int[] arr) {
        return sort(arr, true);
    }

    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if ((isAscending? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0) { // 내림차순
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                } else
                    break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSortOOP is = new InsertionSortOOP();

        System.out.println(Arrays.toString(is.sort(arr, false)));
    }
}
