package com.likelion.javaproject2.week3.day3;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        System.out.println(answer);
    }
}
