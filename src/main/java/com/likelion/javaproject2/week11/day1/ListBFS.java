package com.likelion.javaproject2.week11.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListBFS {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer : 입력받은 문자열을 ' ' (또는 지정된 delimiter)를 기준으로 나누어서 한 단어씩 반환해주는 도구
        StringTokenizer graphTokenizer = new StringTokenizer(reader.readLine());
        // StringTokenizer.nextToken() : 다음 단어를 가져오기
        int maxNodes = Integer.parseInt(graphTokenizer.nextToken()); // 8
        int edges = Integer.parseInt(graphTokenizer.nextToken()); // 10

        // 안쪽의 List<Integer>가 maxNodes의 길이를 반드시 가지지는 않을 것이다.
        List<List<Integer>> adjList = new ArrayList<>();
        // 먼저 리스트의 내용물을 초기화해준다.
        for (int i = 0; i < maxNodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // 간선의 갯수만큼 반복해서 입력을 받는다.
        for (int i = 0; i < edges; i++) {
            // 다음 줄을 단어 단위로 나눠주는 Tokenizer
            StringTokenizer edgeTokenizer = new StringTokenizer(reader.readLine());
            // 입력 줄에 첫번째 숫자
            int startNode = Integer.parseInt(edgeTokenizer.nextToken());
            // 입력 줄에 두번째 숫자
            int endNode = Integer.parseInt(edgeTokenizer.nextToken());

            // adjList의 startNode번째 리스트에 endNode를 첨부
            // 유향 그래프일 경우 아래줄만
            adjList.get(startNode).add(endNode);
            // 무향 그래프일 경우 아래줄도 함꼐
            adjList.get(endNode).add(startNode);
        }
        // 선택사항 : DFS, BFS 를 할 때 이왕이면 방문순서를
        // 작은 숫자부터 와 같은 조건을 붙이고 싶다면 정렬
        for (List<Integer> adjRow : adjList) {
            // 정렬해주는 Collections.sort 메소드
            Collections.sort(adjRow);
        }

        // BFS
        // 다음 방문 대상 기록용 Queue
        Queue<Integer> toVisit = new LinkedList<>();
        // 방문 순서 기록용 List
        List<Integer> visitedOrder = new ArrayList<>();
        // 방문 기록용 boolean[]
        boolean[] visited = new boolean[maxNodes];

        int next = 0;
        toVisit.offer(next);
        // 큐가 비어있지 않은 동안 반복
        while (!toVisit.isEmpty()) {
            // 다음 방문 정점 회수
            next = toVisit.poll();

            // 이미 방문 했다면 다음 반복으로
            if (visited[next]) continue;

            // 방문했다 표시
            visited[next] = true;
            // 방문한 순서 기록
            visitedOrder.add(next);

            // adjList.get(next)가 담겨 있는 미 방문 요소들을 다 넣는다
            List<Integer> canVisitList = adjList.get(next);
            for (Integer canVisit : canVisitList) {
                if (!visited[canVisit])
                    toVisit.offer(canVisit);
            }
        }

        // 출력
        System.out.println(visitedOrder);

    }

    public static void main(String[] args) throws IOException {
        new ListBFS().solution();
    }
}
/*
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */
