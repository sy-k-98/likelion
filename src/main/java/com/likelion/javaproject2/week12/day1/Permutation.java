package com.likelion.javaproject2.week12.day1;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        /*
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
        */

        Permutation perm = new Permutation();
        perm.permNumbers(5, 3, 0, new int[3], new boolean[5]);

        perm.permArray(new int[]{2, 3, 5, 7, 11}, 3, 0, new int[3], new boolean[5]);
    }

    private void permNumbers(
            // 0 ~ n 사이
            int n,
            // r 개를 뽑아서 나열
            int r,
            // 이번에 몇번째 것을 뽑는건지 (재귀 조건)
            int k,
            // 여태까지 만든 순열
            int[] perm,
            // 이 숫자를 사용한적 있는지 여부에 대한 used
            boolean[] used
    ) {
        // 선택할 만큼 선택했다.
        if (k == r) {
            System.out.println(Arrays.toString(perm));
        }
        else {
            // 선택 가능한 숫자 다 확인
            for (int i = 0; i < n; i++) {
                // 이미 사용한 숫자인지 확인
                if (used[i]) continue;
                // 이번 숫자를 선택해서 저장
                perm[k] = i;
                used[i] = true;
                // 다음 숫자 정하기 위한 재귀 호출
                this.permNumbers(n, r, k + 1, perm, used);
                // i를 k의 위치에 담는 과정을 마무리 했으면
                // i를 다시 사용가능한 상태로
                used[i] = false;
            }
        }
    }

    private void permArray(
            int[] numbers,
            // r 개를 뽑아서 나열
            int r,
            // 이번에 몇번째 것을 뽑는건지 (재귀 조건)
            int k,
            // 여태까지 만든 순열
            int[] perm,
            // 이 숫자를 사용한적 있는지 여부에 대한 used
            boolean[] used
    ) {
        // 선택할 만큼 선택했다.
        if (k == r) {
            System.out.println(Arrays.toString(perm));
        }
        else {
            // 선택 가능한 숫자 다 확인
            for (int i = 0; i < numbers.length; i++) {
                // 이미 사용한 숫자인지 확인
                if (used[i]) continue;
                // 이번 숫자를 선택해서 저장
                perm[k] = numbers[i];
                used[i] = true;
                // 다음 숫자 정하기 위한 재귀 호출
                this.permArray(numbers, r, k + 1, perm, used);
                // i를 k의 위치에 담는 과정을 마무리 했으면
                // i를 다시 사용가능한 상태로
                used[i] = false;
            }
        }
    }
}
