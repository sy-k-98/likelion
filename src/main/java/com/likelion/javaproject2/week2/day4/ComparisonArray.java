package com.likelion.javaproject2.week2.day4;

public class ComparisonArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9};
        System.out.printf("%d > %d = %b\n", arr[0], arr[1], arr[0] > arr[1]);
        System.out.printf("%d > %d = %b\n", arr[1], arr[2], arr[1] > arr[2]);
        System.out.printf("%d > %d = %b\n", arr[2], arr[3], arr[2] > arr[3]);
    }
}
