package com.likelion.javaproject2.week3.day2;

public class WhileCnt {
    public static void main(String[] args) {
        System.out.println("증감식을 따로 빼기");
        int cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt);
            cnt++;
        }

        System.out.println("증감식을 출력 한줄에");
        cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt++);
        }
    }
}
