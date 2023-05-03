package com.likelion.javaproject2.week3.day3;

public class SumOfOdds {
    public static void main(String[] args) {
        int answer = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
