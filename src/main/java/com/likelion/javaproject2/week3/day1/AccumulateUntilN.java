package com.likelion.javaproject2.week3.day1;

import java.util.Scanner;

public class AccumulateUntilN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 선언
        int num = sc.nextInt(); // 숫자 한 개를 입력받음
        int sum = 0;// 값이 누적될 변수 선언
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
