package com.likelion.javaproject2.week1;

import java.util.Scanner;

public class ScannerFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%d와 %d의 합은 %d입니다.", val1, val2, val1 + val2);
    }
}
