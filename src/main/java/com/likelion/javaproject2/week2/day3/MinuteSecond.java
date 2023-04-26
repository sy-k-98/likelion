package com.likelion.javaproject2.week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds / 60; // 분을 구함
        int remainSeconds = seconds % 60; // 남은 초를 구함
        System.out.printf("%d분 %d초", minute, remainSeconds);
    }
}
