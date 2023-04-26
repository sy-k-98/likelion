package com.likelion.javaproject2.week2.day3;

import java.util.Arrays;

public class DefineArr2 {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8};

        int[][] arr32 = new int[3][2];
        int[][] arr67 = new int[6][7];

        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        System.out.println(arr2[0][1]);


        int[][] arr = new int[3][3]; // 2차원 배열 선언
        int[] arr0 = arr[0]; // 2차원 배열에서 배열을 꺼내 1차원 배열이 됨
        arr0[0] = 1; // 1차원 배열인 arr0에서 첫번째 칸에 값을 할당

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
