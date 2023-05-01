package com.likelion.javaproject2.week3.day1;

public class ForLoopChar {
    public static void main(String[] args) {
        System.out.println("알파벳 출력");
        for (char c = 'a'; c <= 'z'; c++){
            System.out.printf("%c ", c);
        }
        System.out.println();

        System.out.println("알파벳 아스키코드 출력");
        for (int c = 'A'; c <= 'Z'; c++) {
            System.out.printf("%d ", c);
        }
        System.out.println();

        System.out.println("알파벳 아스키코드 출력2");
        for (int c = 65; c <= 'Z'; c++) {
            System.out.printf("%d:%c ", c, c);
        }
        System.out.println();

        System.out.println("한글 출력");
        for (char c = '가'; c <= '힣'; c++) {
            System.out.printf("%c ", c);
        }
    }
}
