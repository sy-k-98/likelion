package com.likelion.javaproject2.week3.day3;

import java.util.Arrays;
import java.util.Scanner;

public class MakeArray2 {
    public static boolean isNumber05(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int idx = 0;
        int[] answer = new int[r - l];

        for (int i = l; i <= r; i++) {
            if (isNumber05(i)) {
                answer[idx] = i;
                idx++;
            }
        }
        if (idx == 0) {
            answer[idx] = -1;
            idx++;
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(answer, 0, idx)));
    }
}
