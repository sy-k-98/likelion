package com.likelion.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimFill {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------------");
    }

    public static void fillARow(int[][] arr, int rowNum) {
        for (int i = 0; i < arr.length; i++) {
            arr[rowNum][i] = 1;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        fillARow(arr, 2);
        printArray(arr);
    }
}
