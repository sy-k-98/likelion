package codeup.basic100;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();

        double result = h * b * c * s;
        double kb = (result / 8) / Math.pow(2, 10); //KB
        double mb = kb / Math.pow(2, 10); // MB

        System.out.printf("%.1f MB", mb);
    }
}
