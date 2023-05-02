package codeup;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long b = sc.nextLong();

        double result = w * h * b;
        double kb = (result / 8) / Math.pow(2, 10); //KB
        double mb = kb / Math.pow(2, 10); // MB

        System.out.printf("%.2f MB", mb);
    }
}
