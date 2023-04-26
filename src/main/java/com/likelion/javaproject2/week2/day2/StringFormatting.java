package com.likelion.javaproject2.week2.day2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "김소영";
        int balance = 2000000;
        String message = name + "님의 통장잔고는 " + balance + "입니다.";
        System.out.println(message);

        String result = String.format("%s님의 통장 잔고는 %d원입니다.", name, balance);
        System.out.println(message);
    }
}
