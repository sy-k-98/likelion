package com.likelion.javaproject2.week3.day3;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactorization {
    public static int[] solution(int n) {
        int[] arr = new int[n + 1];
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                arr[divisor] = divisor;
                n /= divisor;
            } else divisor++;
        }

        int idx = 0;
        int[] answer = new int[divisor + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }
        answer = Arrays.copyOfRange(answer, 0, idx);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Arrays.toString(solution(num)));
    }
}
