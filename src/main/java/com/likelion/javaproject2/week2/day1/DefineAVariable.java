package com.likelion.javaproject2.week2.day1;

import java.util.Scanner;

public class DefineAVariable {
    public static void main(String[] args) {

        int num = 10;
        String name = "김경록"; // primitive 타입 쓰듯이 초기화
        String name2 = new String("김미미"); // 원래는 이렇게 생김

        String sOne = "1";
        int iOne = 1;
        float fOne = 1.0f;
        System.out.printf("String:%s Number:%d Float:%f", sOne, iOne, fOne);
    }
}
