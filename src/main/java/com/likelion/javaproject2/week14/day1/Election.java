package com.likelion.javaproject2.week14.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// boj - 국회의원 선거
// https://www.acmicpc.net/problem/1417
public class Election {

    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 입력부
        int candidates = Integer.parseInt(reader.readLine());
        // 첫줄이 내 득표수
        int myVote = Integer.parseInt(reader.readLine());
        // 제일 많은 득표자의 표를 먼저 뺏어야 하니까 (Max 우선순위)
        PriorityQueue<Integer> otherVotes
                = new PriorityQueue<>(Collections.reverseOrder());
        // 다솜이 빼고 나머지 표
        for (int i = 0; i < candidates - 1; i++) {
            otherVotes.offer(Integer.parseInt(reader.readLine()));
        }

        // 알고리즘
        int answer = 0;
        // 단일후보가 아닌 경우에만 계산을 진행한다.
        if (!otherVotes.isEmpty()) {
            // 나머지 후보들 득표중 최댓값이 나보다 작아질 때 까지
            while (otherVotes.peek() >= myVote) {
                // 최다 득표자의 득표수
                int votes = otherVotes.poll();
                // 그 사람의 지지자를 한명 매수한다.
                otherVotes.offer(votes - 1);
                // 뺏은 표는 내것으로
                myVote++;
                // 매수 진행 횟수
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Election().solution());
    }
}
