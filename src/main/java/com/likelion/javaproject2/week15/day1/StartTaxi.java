package com.likelion.javaproject2.week15.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// boj - 스타트 택시
// https://www.acmicpc.net/problem/19238
public class StartTaxi {

    private int size;
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        size = Integer.parseInt(infoToken.nextToken());
        int goalCount = Integer.parseInt(infoToken.nextToken());
        int fuel = Integer.parseInt(infoToken.nextToken());
        int[][] map = new int[size][size];
        for (int i = 0; i < size; i++) {
            StringTokenizer rowToken = new StringTokenizer(reader.readLine());
            for (int j = 0; j < size; j++) {
                if (Integer.parseInt(rowToken.nextToken()) == 1) map[i][j] = 1;
            }
        }

        StringTokenizer startToken = new StringTokenizer(reader.readLine());
        int[] start = new int[]{
                Integer.parseInt(startToken.nextToken()) - 1,
                Integer.parseInt(startToken.nextToken()) - 1
        };

        // 승객 정보 저장용 배열 2개
        int[][] customers = new int[goalCount][];
        int[][] goals = new int[goalCount][];

        for (int i = 0; i < goalCount; i++) {
            StringTokenizer customerToken = new StringTokenizer(reader.readLine());
            customers[i] = new int[]{
                    Integer.parseInt(customerToken.nextToken()) - 1,
                    Integer.parseInt(customerToken.nextToken()) - 1
            };
            goals[i] = new int[]{
                    Integer.parseInt(customerToken.nextToken()) - 1,
                    Integer.parseInt(customerToken.nextToken()) - 1
            };
        }

        // 승객을 잘 보냈는지
        boolean[] done = new boolean[goalCount];
        // 델타 탐색용
        int[][] deltas = new int[][]{
                new int[]{-1, 0},
                new int[]{1, 0},
                new int[]{0, -1},
                new int[]{0, 1},
        };

        while (!finished(done)) {
            // while 내부에서 방문 여부 배열을 초기화
            // 승객을 무사히 보내드렸으면 이미 왔던 길을 다시 갈 수도 있기 때문
            boolean[][] visited = new boolean[size][size];
            visited[start[0]][start[1]] = true;
            Queue<int[]> toVisit = new LinkedList<>();
            // 승객까지의 최단거리도 기억
            toVisit.add(new int[]{start[0], start[1], 0});

            // 승객을 만난 적 있는지 -> 이때 승객을 한번 만났다고 BFS 중단하지 않음
            // 대신 현재 큐에 남아있는 지점들만 방문 -> 같은 거리의 다른 승객이 있을 수 있기 때문
            boolean meetCustomer = false;
            int nearCustomerIdx = -1;
            int nearCustomerDist = 0;
            // 고객한테 간다.
            while (!toVisit.isEmpty()) {
                int[] now = toVisit.poll();
                int isCustomer = isCustomer(customers, now);
                if (isCustomer != -1 && !done[isCustomer]){
                    // 이번 회차에서 최초로 만난 손님
                    if (!meetCustomer) {
                        meetCustomer = true;
                        nearCustomerIdx = isCustomer;
                        nearCustomerDist = now[2];
                    }
                    // 이미 이번 회차에서 손님 만난 적 있음
                    // 그중 좀더 빨리 만나는 경우 (는 사실 없다)
                    else if (nearCustomerDist > now[2]){
                        nearCustomerIdx = isCustomer;
                    }
                    // 같은 경우 행 후 열 찾기
                    else if (nearCustomerDist == now[2]) {
                        // 지금 행이 더 작다
                        if (now[0] > customers[nearCustomerIdx][0])
                            continue;
                            // 새로운 행이 더 작다
                        else if (now[0] < customers[nearCustomerIdx][0]) {
                            nearCustomerIdx = isCustomer;
                        }
                        // 동일하면 열 비교
                        else if (now[1] > customers[nearCustomerIdx][1]){
                            continue;
                        }
                        else {
                            nearCustomerIdx = isCustomer;
                        }
                    }
                    // 늦게 만난 경우는 그냥 스킵
                }
                // 손님을 만난 상태면 더이상 탐색하지 않는다.
                if(!meetCustomer) for (int[] delta: deltas) {
                    int nextY = now[0] + delta[0];
                    int nextX = now[1] + delta[1];
                    if (
                            checkBounds(nextX, nextY) &&
                                    map[nextY][nextX] == 0 &&
                                    !visited[nextY][nextX]
                    ) {
                        visited[nextY][nextX] = true;
                        toVisit.add(new int[]{nextY, nextX, now[2] + 1});
                    }
                }
            }
            // 손님을 못만났다
            if (nearCustomerIdx == -1) break;
            // 연료가 부족하다
            fuel -= nearCustomerDist;
            if (!(fuel > 0)) break;
            // 방문 기록 초기화
            visited = new boolean[size][size];
            // 고객을 목적지로
            // 고객의 위치가 시작지점
            toVisit.add(new int[]{
                    customers[nearCustomerIdx][0],
                    customers[nearCustomerIdx][1],
                    0
            });
            // 목적지를 다음 시작지점으로 설정 해둔다.
            start = goals[nearCustomerIdx];
            int goalDist = 0;
            while (!toVisit.isEmpty()) {
                int[] now = toVisit.poll();
                if (now[0] == start[0] && now[1] == start[1]) {
                    goalDist = now[2];
                    break;
                }
                for (int[] delta: deltas) {
                    int nextY = now[0] + delta[0];
                    int nextX = now[1] + delta[1];
                    if (
                            checkBounds(nextX, nextY) &&
                                    map[nextY][nextX] == 0 &&
                                    !visited[nextY][nextX]
                    ) {
                        visited[nextY][nextX] = true;
                        toVisit.add(new int[]{nextY, nextX, now[2] + 1});
                    }
                }
            }
            // 도착하지 못해서 기름값 갱신이 없었다.
            if (goalDist == 0) break;
            // 도착하기 전에 연료가 다한다.
            fuel -= goalDist;
            if (fuel < 0) break;
                // 도착해서 충전
            else fuel += (goalDist * 2);
            done[nearCustomerIdx] = true;
        }
        if (finished(done)) return fuel;
        return -1;
    }

    private boolean finished(boolean[] doneList) {
        for (boolean done: doneList)
            if (!done) return false;
        return true;
    }

    private int isCustomer(int[][] customers, int[] point) {
        for (int i = 0; i < customers.length; i++) {
            int[] customer = customers[i];
            if (point[0] == customer[0] && point[1] == customer[1])
                return i;
        }
        return -1;
    }

    private boolean checkBounds(int x, int y){
        return -1 < x && x < size && -1 < y && y < size;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new StartTaxi().solution());
    }

}
