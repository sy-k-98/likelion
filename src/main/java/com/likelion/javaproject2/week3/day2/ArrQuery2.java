package com.likelion.javaproject2.week3.day2;

import java.util.Arrays;

public class ArrQuery2 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int j = 0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    answer[j] = Math.min(answer[j], arr[i]);
                }
            }
            if (answer[j] == Integer.MAX_VALUE)
                answer[j] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
