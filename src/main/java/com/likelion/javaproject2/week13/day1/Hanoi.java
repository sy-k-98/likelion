package com.likelion.javaproject2.week13.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi {

    private StringBuilder towerBuilder;

    public void solution() throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        this.towerBuilder = new StringBuilder();
        // 점화식을 이용해 풀이
        this.towerBuilder.append((int) (Math.pow(2, n) - 1)).append('\n');
        hanoi(n, 1, 3, 2);
        System.out.println(towerBuilder);
    }

    public void hanoi(
            int height, // 옮기고자 하는 탑의 높이
            int start,  // 시작 위치
            int end,    // 목표 위치
            int other   // 이동하지 않는 위치, 재귀 호출 시 end로 가지 않고 other로 보냄
    ) {
        if (height == 1) {
            this.towerBuilder.append(start + " " + end + "\n");
        } else {
            hanoi(height - 1, start, other, end);
            this.towerBuilder.append(start + " " + end + "\n");
            hanoi(height - 1, other, end, start);
        }
    }

    public static void main(String[] args) throws IOException {
        new Hanoi().solution();
    }
}
