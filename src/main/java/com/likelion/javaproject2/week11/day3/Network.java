package com.likelion.javaproject2.week11.day3;

import java.util.LinkedList;
import java.util.Queue;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 방문했는지 파악
        boolean[] visited = new boolean[n];
        // 모든 컴퓨터(정점)를 순회
        for (int i = 0; i < n; i++) {
            // 이 컴퓨터가 속한 네트워크를 확인한 적 없다면 방문한 적이 없음
            if (!visited[i]) {
                // DFS or BFS
                network(i, n, computers, visited);
                answer++;
            }
        }
        return answer;
    }

    public void network(int computer, int n, int[][] computers, boolean[] visited) {
        Queue<Integer> toVisit = new LinkedList<>();
        toVisit.offer(computer);
        while (!toVisit.isEmpty()) {
            int next = toVisit.poll();
            for (int i = 0; i < n; i++) {
                // computers[next][i] == 1 : 연결되어 있음
                // !visited[i] : 방문한적 없음
                if (computers[next][i] == 1 && !visited[i]) {
                    toVisit.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int answer = new Network().solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        });
        System.out.println(answer);
    }
}
