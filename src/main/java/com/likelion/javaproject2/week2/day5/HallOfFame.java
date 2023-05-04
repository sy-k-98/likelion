package com.likelion.javaproject2.week2.day5;

import java.util.Arrays;

public class HallOfFame {
    public static int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];
        answer[0] = score[0];

        for (int i = 0; i < score.length; i++)
        {
            int[] tmp = Arrays.copyOfRange(score, 0, i + 1);
            if (i < k) {
                answer[i] = sortArr(tmp)[tmp.length - 1];
            }
            else{
                answer[i] = Arrays.copyOfRange(sortArr(tmp), 0, k)[k - 1];
            }
            System.out.println(answer[i]);
        }

    }

}
