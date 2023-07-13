package com.likelion.javaproject2.week13.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// boj - n번째 큰 수
// https://www.acmicpc.net/problem/2075
public class NthNumber {

    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        // 우선순위 큐 만들기
        // 최소 값이 먼저 나오는 우선순위 큐
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            // 숫자 입력 지속적으로 받기
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                priorityQueue.offer(Integer.parseInt(tokenizer.nextToken()));
                // 우선순위 큐의 크기를 일정하게 유지
                if (priorityQueue.size() > n)
                    // n개의 숫자만 남기고 작은 숫자를 우선순위 큐에서 빼고 있기 때문에
                    // 최종적으로 남는 숫자 n개는 큰 숫자 n개
                    priorityQueue.poll();

            }
        }
        // 특히 TOP에 있는 마지막 원소는 N번째로 큰 숫자
        return priorityQueue.peek();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new NthNumber().solution());
    }

}
