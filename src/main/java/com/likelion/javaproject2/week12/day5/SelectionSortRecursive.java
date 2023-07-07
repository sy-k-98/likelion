package com.likelion.javaproject2.week12.day5;

import java.util.Arrays;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {25, 12, 18, 24, 2, 21};

        new SelectionSortRecursive().sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr, int start) {
        // 모든 원소 확인
        if (!(start < arr.length)) return;

        int minIndex = start;
        for (int i = start + 1; i < arr.length ; i++) {
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }

        int tmp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = tmp;

        sort(arr, start + 1);
    }
}
