package com.likelion.javaproject2.week12.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// boj - 회의실 배정
// https://www.acmicpc.net/problem/1931
public class MeetingRoom {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(reader.readLine());
        int[][] meetings = new int[meetingCount][2];

        for (int i = 0; i < meetingCount; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            meetings[i][0] = Integer.parseInt(tokenizer.nextToken());
            meetings[i][1] = Integer.parseInt(tokenizer.nextToken());
        }

        // Arrays.sort 배열을 정렬
        // 회의 정보를 종료시간 기준으로 정렬
        // 종료시간이 같으면 시작시간을 기준으로 정렬
        Arrays.sort(
                meetings,
//                Comparator.comparingInt(o -> o[1])
                (o1, o2) -> {
                    // o1은 {시작시간, 종료시간}
                    // o2도 {시작시간, 종료시간}
                    // 종료시간이 다르면 종료시간 기준 비교
                    if (o1[1] != o2[1]) return o1[1] - o2[1];
                    // 아니라면 시작 시간 기준 비교
                    return o1[0] - o2[0];
                }
        );

        // 답안을 저장하기 위한 용도
        int answer = 0;
        // 마지막 종료시간을 저장하기 위한 용도
        int lastEnd = 0;
        for (int i = 0; i < meetingCount; i++) {
            if (meetings[i][0] >= lastEnd) {
                answer++;
                lastEnd = meetings[i][1];
            }
        }
        return answer;
    }


        public static void main (String[]args) throws IOException {
            System.out.println(new MeetingRoom().solution());
        }
    }
