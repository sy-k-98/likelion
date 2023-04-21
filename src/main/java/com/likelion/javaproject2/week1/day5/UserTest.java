package com.likelion.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User kimsy = new User();
        kimsy.name = "김소영";
        kimsy.phoneNumber = "010-****-****";
        kimsy.age = 100;

        System.out.printf("%s님은 성인입니까? %s\n", kimsy.name, kimsy.isAdult());
    }
}
