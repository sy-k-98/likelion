package com.likelion.javaproject2.week14.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// boj - 스티커
// https://www.acmicpc.net/problem/9465
public class Sticker {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int testCases = Integer.parseInt(reader.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < testCases; i++) {
            int n = Integer.parseInt(reader.readLine());
            int[][] stickers = new int[2][n];
            for (int j = 0; j < 2; j++) {
                StringTokenizer stickerToken = new StringTokenizer(reader.readLine());
                for (int k = 0; k < n; k++) {
                    stickers[j][k] = Integer.parseInt(stickerToken.nextToken());
                }
            }
            answer.append(solve(n, stickers)).append('\n');
        }
        System.out.print(answer);
    }

    private int solve(int cols, int[][] stickers) {
        if (cols == 1) return Math.max(stickers[0][0], stickers[1][0]);
        // 첫번째 열은 스티커 값 그대로
        int[][] dp = new int[2][cols];
        dp[0][0] = stickers[0][0];
        dp[1][0] = stickers[1][0];
        // 두번째 열은 자신의 값 + 왼쪽 대각선의 값
        dp[0][1] = dp[1][0] + stickers[0][1];
        dp[1][1] = dp[0][0] + stickers[1][1];
        // 세번째 이후
        for (int i = 2; i < cols; i++) {
            dp[0][i] = Math.max(
                    // 왼쪽 아래 대각선 활용
                    dp[1][i - 1] + stickers[0][i],
                    // 왼쪽 왼쪽 아래 대각선 활용
                    dp[1][i - 2] + stickers[0][i]);
            dp[1][i] = Math.max(dp[0][i - 1] + stickers[1][i], dp[0][i - 2] + stickers[1][i]);
        }

        // 마지막 열의 숫자들 중 더 큰 숫자
        return Math.max(dp[0][cols - 1], dp[1][cols - 1]);
    }

    public static void main(String[] args) throws IOException {
        new Sticker().solution();
    }
}