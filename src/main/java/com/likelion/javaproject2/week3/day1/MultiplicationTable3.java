package com.likelion.javaproject2.week3.day1;

public class MultiplicationTable3 {
    public static void printDan(int dan) {
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, i * dan);
        }
        System.out.println("--------");
    }

    public static void main(String[] args) {
        printDan(2);
        printDan(4);
        printDan(8);
        printDan(9);
    }
}
