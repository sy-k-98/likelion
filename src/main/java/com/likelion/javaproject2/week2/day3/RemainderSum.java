package com.likelion.javaproject2.week2.day3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int first = num % 10;   //687을 10으로 나눈 나머지
        num = num / 10;     // num = 68
        int second = num % 10;   //68을 10으로 나눈 나머지
        num = num / 10;      // num = 6
        int third = num % 10;    //6을 10으로 나눈 나머지
        System.out.println(first + second + third);
    }
}
