package com.likelion.javaproject2.week11.day2;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapBFS {
    private int[] dx = new int[]{-1, 1, 0, 0};
    private int[] dy = new int[]{0, 0, -1, 1};
    private int n;
    private int m;

    // 최단 거리를 돌려준다
    public int solution(int[][] maze) {
        n = maze.length;
        m = maze[0].length;

        // int[]를 담는 Queue, {x, y, 여태까지 이동거리}
        Queue<int[]> visitNext = new LinkedList<>();
        // 미로에서 이미 도달한 적 있는 칸임을 나타내기 위한 visited 이차원 배열
        boolean[][] visited = new boolean[n][m];
        visitNext.offer(new int[]{0, 0, 1});
        int answer = -1;

        // BFS 시작
        while (!visitNext.isEmpty()) {      // Queue가 비어있지 않은 동안
            int[] next = visitNext.poll();  // 다음에 갈곳을 Queue에서 꺼낸다.
            int nx = next[0];
            int ny = next[1];
            int steps = next[2];
            // 현재 칸이 n, m 이라면,
            if (nx == n - 1 && ny == m - 1) {
                answer = steps;
                break;
            }

            // 4개의 방향을 확인한다.
            for (int i = 0; i < 4; i++) {
                int nextX = nx + dx[i];
                int nextY = ny + dy[i];
                if (
                    // 1. 미로의 범위를 벗어나진 않는지
                        checkBounds(nextX, nextY) &&
                                // 2. 미로에서 진행 가능한 칸인지 (0 또는 3)
                                maze[nextX][nextY] == 1 &&
                                // 3. 아직 방문한적 없는지
                                !visited[nextX][nextY]
                ) {
                    // 큐에 방문 대상으로 기록
                    visitNext.offer(new int[]{nextX, nextY, steps + 1});
                    // 효율성 검사 통과를 위해 방문 전에 기록한다.
                    visited[nextX][nextY] = true;
                }
            }
        }
        return answer;
    }

    // 미로의 범위 내에 있는지 검사하는 메소드
    private boolean checkBounds(int x, int y) {
        return -1 < x && x < n && -1 < y && y < m;
    }

    public static void main(String[] args) {
        int answer = new GameMapBFS().solution(new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        });
        System.out.println(answer);
    }
}
