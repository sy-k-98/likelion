package com.likelion.javaproject2.week3.day1;

import java.util.Scanner;

public class DiceGame2 {
    public static int solution(int a, int b, int c) {
        int answer = 0;

        if (a != b && b != c && c != a) {
            answer = a + b + c;
        }
        else if (a == b && b == c && c == a) {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        else {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solution(a, b, c));
    }
}
