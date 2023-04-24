package com.likelion.javaproject2.week2.day1;

public class StringPlusInt {
    public static void main(String[] args) {

        System.out.println("1" + 1); // 11로 출력
        System.out.println(1 + "1"); // 11로 출력

//        int result = 1 + "1"; // 에러

        int iResult = 1 + Integer.parseInt("1");
        System.out.println("iResult = " + iResult);
    }
}
