package com.likelion.javaproject2.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        // 5! = 120
        int num = 5;
        int answer = 1;
        while (num > 0) {
            answer *= num--;
            System.out.println(answer);
        }
    }
}
