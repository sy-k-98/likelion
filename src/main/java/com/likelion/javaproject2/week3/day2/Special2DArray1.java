package com.likelion.javaproject2.week3.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Special2DArray1 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) answer[i][j] = 1;
                else answer[i][j] = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Arrays.deepToString(solution(num)));
    }
}
