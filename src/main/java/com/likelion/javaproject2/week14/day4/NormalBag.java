package com.likelion.javaproject2.week14.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// boj - 평범한 배낭
// https://www.acmicpc.net/problem/12865
public class NormalBag {

    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        int itemCount = Integer.parseInt(infoToken.nextToken());
        int totalWeight = Integer.parseInt(infoToken.nextToken());

        // 가방의 무게 - 고르는 아이템의 종류
        int[][] dp = new int[itemCount + 1][totalWeight + 1];
        // 물건 저장공간
        int[][] items = new int[itemCount + 1][];
        for (int i = 1; i < itemCount + 1; i++) {
            StringTokenizer itemToken = new StringTokenizer(reader.readLine());
            items[i] = new int[]{
                    // 무게
                    Integer.parseInt(itemToken.nextToken()),
                    // 가치
                    Integer.parseInt(itemToken.nextToken())
            };
        }

        for (int itemNumber = 1; itemNumber < itemCount + 1; itemNumber++) {
            int itemWeight = items[itemNumber][0];
            int itemValue = items[itemNumber][1];
            for (int currentWeight = 0; currentWeight < totalWeight + 1; currentWeight++) {
                // 지금 무게에서 현재 살피고 있는 물건을 추가할 수 없으면
                if (itemWeight > currentWeight)
                    dp[itemNumber][currentWeight] = dp[itemNumber - 1][currentWeight];
                else dp[itemNumber][currentWeight] = Math.max(
                        // 이전 아이템 까지만 고려했을 때의 현재 무게에서의 최대 가치
                        dp[itemNumber - 1][currentWeight],
                        // 이번 아이템을 넣어보고, 그에 따라서 추가할 수 있는 가치를 이전에서 살펴본 결과
                        itemValue + dp[itemNumber - 1][currentWeight - itemWeight]
                );
            }
        }

        System.out.println(Arrays.deepToString(dp));

        return dp[itemCount][totalWeight];
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new NormalBag().solution());
    }

}
