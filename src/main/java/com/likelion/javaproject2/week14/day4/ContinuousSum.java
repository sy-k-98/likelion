package com.likelion.javaproject2.week14.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// boj - 연속합
// https://www.acmicpc.net/problem/1912
public class ContinuousSum {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        StringTokenizer numberToken = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numberToken.nextToken());
        }

        // 여태가지 수열의 합 중에서 i 번째 숫자는 무조건 포함한 수열의 최댓값
        int[] dp = new int[n];
        dp[0] = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < n; i++) {
            // 지금의 합 + 현재 숫자 vs 현재 숫자
            dp[i] = Math.max(dp[i - 1] + numbers[i], numbers[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new ContinuousSum().solution());
    }
}
