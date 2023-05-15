package com.likelion.javaproject2.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortOOP {
    Comparator<Integer> comparator;

    public BubbleSortOOP(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            if (comparator.compare(arr[i], arr[i + 1]) > 0) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int j = 1; j <= arr.length; j++) {
            arr = sortARound(arr, arr.length - j);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSortOOP bubbleSortOOP = new BubbleSortOOP(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // 오름차순 (o2 - o1 : 내림차순)
            }
        });

        int[] arr = {7, 2, 3, 9, 28, 1};

        arr = bubbleSortOOP.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
