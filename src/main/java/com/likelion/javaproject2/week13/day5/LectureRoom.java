package com.likelion.javaproject2.week13.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// boj - 강의실 배정
// https://www.acmicpc.net/problem/11000
public class LectureRoom {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int courses = Integer.parseInt(reader.readLine());
        PriorityQueue<int[]> lectureQueue = new PriorityQueue<>(
                Comparator.comparingInt(o -> o[0]));

        // 강의 정보 입력
        for (int i = 0; i < courses; i++) {
            StringTokenizer courseToken = new StringTokenizer(reader.readLine());
            lectureQueue.offer(new int[]{
                    Integer.parseInt(courseToken.nextToken()),
                    Integer.parseInt(courseToken.nextToken())
            });
        }

        // 종료시간을 정렬하기 위한 우선순위 큐
        PriorityQueue<Integer> roomQueue = new PriorityQueue<>();
        // 모든 강의를 확인
        while (!lectureQueue.isEmpty()) {
            int[] nextLecture = lectureQueue.poll();
            // 지금 사용 중인 강의실 중 가장 빨리 비는 강의실이 나의 시작시간보다 빨리 끝날 경우, 해당 강의실 사용
            if (!roomQueue.isEmpty() && roomQueue.peek() <= nextLecture[0])
                roomQueue.poll();

            // 나의 종료시간 넣어주기
            roomQueue.offer(nextLecture[1]);
        }

        return roomQueue.size();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new LectureRoom().solution());
    }
}
