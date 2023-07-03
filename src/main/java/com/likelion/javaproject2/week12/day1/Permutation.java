package com.likelion.javaproject2.week12.day1;

public class Permutation {
    public static void main(String[] args) {
        // 0 ~ 4 사이의 3개의 숫자가 있다
        // 겹치지 않도록 3개를 골라 나열한 모든 경우의 수를 출력

        // 5개의 숫자를 담은 int[] 배열에서 3개를 골라 나열해보자
        int[] numbers = new int[]{10, 12, 14, 16, 18};
        // 1. 첫번째 숫자를 for 반복으로 구하기
        for (int i = 0; i < 5; i++) {
            // 2. 두번째 숫자를 for 반복으로 구하기
            for (int j = 0; j < 5; j++) {
                // 만약 이미 고른 숫자라면 스킵
                if (i == j) continue;
                // 3. 세번쨰 숫자를 for 반복으로 구하기
                for (int k = 0; k < 5; k++) {
                    // 만약 이미 고른 숫자라면 스킵
                    if (k == i || k == j) continue;
                    System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                }
            }
        }


    }
}
