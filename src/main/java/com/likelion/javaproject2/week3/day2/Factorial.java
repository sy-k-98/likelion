package com.likelion.javaproject2.week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        for(int i = 1; i <= n; i++) { // i=1대신 i=2도 가능
            answer *= i;
        }
        System.out.println(answer);
    }
}
