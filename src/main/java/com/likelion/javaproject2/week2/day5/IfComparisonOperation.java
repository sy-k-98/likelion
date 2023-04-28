package com.likelion.javaproject2.week2.day5;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18; // boolean 타입 변수 선언
        if (isAdult) { // 변수를 if문의 입력값으로 사용
            System.out.println("성인입니다.");
        }
        if (age < 18) { // 비교 연산을 if문의 입력값으로 사용
            System.out.println("미성년자입니다.");
        }
    }
}
