package com.likelion.javaproject2.week3.day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("2단만 출력");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("2 * %d = %d\n", i, 2 * i);
        }

        System.out.println("--2단부터 4단까지 출력--");
        for (int j = 2; j <= 4; j++) {
            System.out.printf("---%d단 출력---\n", j);
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n",j, i, 2 * i);
            }
        }
    }
}