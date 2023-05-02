package com.likelion.javaproject2.week3.day2;

public class ForLoopUntil {
    public static void main(String[] args) {
//        for (int i = 2; 1 == 1; i++) { // 1 == 1 : 항상 true -> 계속 실행
//            System.out.println(i);
//        }

        for (int i = 2; 2 * i <= 18; i++) {
            System.out.println(i); // 2 ~ 9 까지 출력
        }

        for (int i = 2; i * i <= 50; i++) { // 제곱근 관련 연산
            System.out.println(i);
        }

    }
}
