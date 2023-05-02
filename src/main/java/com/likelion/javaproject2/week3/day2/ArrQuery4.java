package com.likelion.javaproject2.week3.day2;

import java.util.Arrays;

public class ArrQuery4 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int j = 0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
