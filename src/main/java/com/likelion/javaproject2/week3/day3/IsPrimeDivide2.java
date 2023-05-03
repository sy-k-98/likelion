package com.likelion.javaproject2.week3.day3;

import java.util.Scanner;

public class IsPrimeDivide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        if (factors == 0) System.out.println("prime");
        else System.out.println("not prime");
    }
}
