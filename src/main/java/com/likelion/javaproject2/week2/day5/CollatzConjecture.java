package com.likelion.javaproject2.week2.day5;

import java.util.Scanner;

public class CollatzConjecture {
    public static int solution(long num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;

            if (answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(solution(num));
    }
}
