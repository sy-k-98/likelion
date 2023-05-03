package codeup;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long r = sc.nextLong();
        long n = sc.nextLong();
        long answer = a;
        for (int i = 1; i < n; i++) answer *= r;

        System.out.println(answer);
    }
}
