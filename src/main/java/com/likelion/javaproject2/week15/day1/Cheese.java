package com.likelion.javaproject2.week15.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// boj - 치즈
// https://www.acmicpc.net/problem/2636
public class Cheese {

    private final int[][] deltas = new int[][]{
            new int[]{-1, 0},
            new int[]{1, 0},
            new int[]{0, -1},
            new int[]{0, 1},
    };
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer colRowToken = new StringTokenizer(reader.readLine());
        int y = Integer.parseInt(colRowToken.nextToken());
        int x = Integer.parseInt(colRowToken.nextToken());

        int cheeseCount = 0;
        int lastCheese = 0;

        int[][] board = new int[y][x];
        for (int i = 0; i < y; i++) {
            StringTokenizer rowToken = new StringTokenizer(reader.readLine());
            for (int j = 0; j < x; j++) {
                board[i][j] = Integer.parseInt(rowToken.nextToken());
                if (board[i][j] == 1) cheeseCount++;
            }
        }

        // 방문정보 확인
        boolean[][] visited = new boolean[y][x];
        // 몇시간이 지났는지
        int reps = 0;
        Queue<int[]> thisRep = new LinkedList<>();
        thisRep.add(new int[]{0, 0});

        // 치즈가 남아있는 동안
        while (cheeseCount > 0) {
            reps++;
            // 치즈를 만나면 이번이 아닌 다음번에 주변을 살펴봐야 하기 때문에
            // thisVisit과 분리한다
            Queue<int[]> nextRep = new LinkedList<>();
            Queue<int[]> nextMelt = new LinkedList<>();
            while (!thisRep.isEmpty()) {
                int[] now = thisRep.poll();
                for (int[] delta: deltas) {
                    int nextY = now[0] - delta[0];
                    int nextX = now[1] - delta[1];
                    if (-1 < nextX && nextX < x &&
                            -1 < nextY && nextY < y && !visited[nextY][nextX]){
                        visited[nextY][nextX] = true;
                        int[] next = new int[]{nextY, nextX};
                        // 다음방문할 곳이 치즈
                        if (board[nextY][nextX] == 1) {
                            nextMelt.add(next);
                            nextRep.add(next);
                        }
                        else {
                            thisRep.add(next);
                        }
                    }
                }
            }
            // 이번시간에 어떤 치즈가 녹을지 알아냈음 ->  다음 시간에 적용
            // 다음시간에 방문할 곳 지정
            thisRep = nextRep;
            // 현재 치즈의 갯수가 정답에서 요구하는 직전 시간의 치즈 갯수일 가능성이 높음
            lastCheese = cheeseCount;
            // 남아 있는 치즈의 갯수 계산
            cheeseCount -= nextMelt.size();
            while (!nextMelt.isEmpty()) {
                int[] melt = nextMelt.poll();
                board[melt[0]][melt[1]] = 0;
            }
        }

        System.out.println(reps + "\n" + lastCheese);
    }

    public static void main(String[] args) throws IOException {
        new Cheese().solution();
    }

}
