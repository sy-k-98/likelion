package codeup.basic100;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int answer = a;
        for (int i = 1; i < n; i++) answer += d;

        System.out.println(answer);
    }
}
