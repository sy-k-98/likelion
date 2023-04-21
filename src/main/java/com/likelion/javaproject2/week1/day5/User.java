package com.likelion.javaproject2.week1.day5;

public class User {
    // 이름, 전화번호, 나이
    String name;
    String phoneNumber;
    int age;

    boolean isAdult() {
        return age >= 18;
    }
}
