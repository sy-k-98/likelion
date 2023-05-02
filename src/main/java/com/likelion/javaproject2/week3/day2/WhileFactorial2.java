package com.likelion.javaproject2.week3.day2;

public class WhileFactorial2 {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1;
        while (num > 1) {
            answer *= num--;
        }
        System.out.println(answer); // 결과는 한번만 출력
    }
}
