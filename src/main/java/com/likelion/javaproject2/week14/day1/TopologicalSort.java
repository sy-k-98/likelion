package com.likelion.javaproject2.week14.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TopologicalSort {
    private List<List<Integer>> adjList;
    private int nodes;

    public void topologicalSort() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        // 정점 갯수 기록
        nodes = Integer.parseInt(infoToken.nextToken());
        // 간선 갯수 기록
        int edges = Integer.parseInt(infoToken.nextToken());
        adjList = new ArrayList<>();
        // 인접 리스트 초기화
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
        // 그래프 입력받기
        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeToken = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(edgeToken.nextToken());
            int end = Integer.parseInt(edgeToken.nextToken());
            adjList.get(start).add(end);
        }

        kahn();
        dfs();
    }

    // nodes : 정점의 갯수, adjList : 인접 리스트
    private void kahn() {
        // 1. 진입 차수를 구한다.
        int[] inDegrees = new int[nodes];
        // List<Integer> neighbors : 각 정점에서 도달할 수 있는 정점을 리스트
        for (List<Integer> neighbors : adjList) {
            // neighbor : 그 정점에서 도달 가능한 정점들 (개별)
            for (int neighbor : neighbors) {
                // 그들의 진입차수 높이기
                inDegrees[neighbor]++;
            }
        }

        // 2. 진입 차수가 0인 정점을 Queue에 삽입
        Queue<Integer> queue = new LinkedList<>();
        // 진입 차수가 0인 정점들 부터 시작
        for (int i = 0; i < nodes; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        // 3. Queue 가 비어있지 않을 동안
        while (!queue.isEmpty()) {
            int node = queue.poll();
            // 3-1. 이번 방문점을 기록
            result.add(node);

            // 3-2. 현재 방문점의 인접 정점들의 진입 차수를 하나 줄인다.
            for (int neighbor : adjList.get(node)) {
                inDegrees[neighbor]--;
                // 3-3. 진입 차수가 0이 되면 방문 가능 (Queue에 삽입)
                if (inDegrees[neighbor] == 0)
                    queue.offer(neighbor);
            }
        }
        // 4. 결과에 기록된 정점 갯수가 실제 정점보다 적을 경우 위상 정렬 불가
        if (result.size() < nodes)
            System.out.println(new ArrayList<>());
        else System.out.println(result);
    }

    private void dfs() {
        boolean[] visited = new boolean[nodes];
        boolean[] inProcess = new boolean[nodes];
        Stack<Integer> resultReversed = new Stack<>();
        boolean success = true;
        for (int i = 0; i < nodes; i++) {
            if (!visited[i])
                success = dfsRecursive(i, visited, inProcess, resultReversed);
            if (!success) break;
        }
        List<Integer> result = new ArrayList<>();
        if (success)
            while (!resultReversed.empty())
                result.add(resultReversed.pop());

        System.out.println(result);
    }

    private boolean dfsRecursive(
            int next,
            boolean[] visited,
            boolean[] inProcess,
            Stack<Integer> resultReversed
    ) {
        // 일단 방문 정점을 방문 및 처리 중으로 표시
        visited[next] = true;
        inProcess[next] = true;

        for (int neighbor : adjList.get(next)) {
            // 처리 중 (인접 정점이 남은 정점)인 정점을 만나면 이는 싸이클이다.
            if (inProcess[neighbor]) return false;
                // 미방문 정점을 만나면 다음 재귀
            else if (!visited[neighbor])
                // 재귀 중 false 는 싸이클의 존재를 의미
                if (!dfsRecursive(neighbor, visited, inProcess, resultReversed))
                    return false;
        }
        // for의 종료는 모든 인접 정점의 방문을 의미, 기록한다.
        resultReversed.push(next);
        // 처리가 끝났으니 처리 중 배열은 false 로
        inProcess[next] = false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        new TopologicalSort().topologicalSort();
    }
}
/*
정점 간선
7 8
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6

 */

/*
7 9
0 1
0 2
1 3
1 4
2 3
2 6
3 5
4 3
4 5

 */

/*
7 9
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6
3 0

 */
