package com.likelion.javaproject2.week11.day2;

import java.util.LinkedList;
import java.util.Queue;

public class Maze {

    private int[] dx = new int[]{-1, 1, 0, 0};
    private int[] dy = new int[]{0, 0, -1, 1};

    // 최단 거리 반환
    public int solution(int[][] maze) {
        // BFS 로직 활용
        // 다음에 접근할 수 있는 칸을 maze의 가로세로 크기 이내의 인접한 칸을 기준으로 판단

        // int[] 를 담는 Queue, {x, y, 이동거리}
        Queue<int[]> visitNext = new LinkedList<>();

        // 미로에서 이미 도달한 적 있는 칸임을 나타내기 위한 visited 이차원 배열
        boolean[][] visited = new boolean[6][6];

        visitNext.offer(new int[]{5, 0, 0}); // 시작점
        int answer = -1;

        // BFS 시작
        while (!visitNext.isEmpty()) {      // Queue가 비어있지 않는 동안
            int[] next = visitNext.poll();  // 다음에 갈 곳을 꺼냄
            int nx = next[0];
            int ny = next[1];
            int steps = next[2];

            // 도착점
            if (maze[nx][ny] == 3) {
                answer = steps;
                break;
            }

            visited[nx][ny] = true;

            // 4개의 방향 확인
            for (int i = 0; i < 4; i++) {
                int nextX = nx + dx[i];
                int nextY = ny + dy[i];
                if (checkBounds(nextX, nextY) &&
                        (maze[nextX][nextY] == 0 || maze[nextX][nextY] == 3) &&
                        !visited[nextX][nextY]
                ) {
                    visitNext.offer(new int[]{nextX, nextY, steps + 1});
                }
            }
        }

        return answer;
    }

    // 미로의 범위 내에 있는지 검사하는 메소드
    private boolean checkBounds(int x, int y) {
        return -1 < x && x < 6 && -1 < y && y < 6;
    }

    public static void main(String[] args) {
        // 2가 시작점, 3이 목적지
        int answer = new Maze().solution(new int[][]{
                {0, 0, 0, 0, 0, 3},
                {1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {2, 1, 1, 0, 1, 1}
        });
        System.out.println(answer);
    }
}
