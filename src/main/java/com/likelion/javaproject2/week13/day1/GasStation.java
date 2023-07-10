package com.likelion.javaproject2.week13.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// boj - 주유소
// https://www.acmicpc.net/problem/13305
public class GasStation {

    public long solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long cityCount = Integer.parseInt(reader.readLine());
        StringTokenizer cityDistToken = new StringTokenizer(reader.readLine());
        long[] cityDistance = new long[(int) (cityCount - 1)];
        for (int i = 0; i < cityCount - 1; i++) {
            cityDistance[i] = Integer.parseInt(cityDistToken.nextToken());
        }

        StringTokenizer cityFuelToken = new StringTokenizer(reader.readLine());
        // 각 도시의 기름값 정보
        long[] cityFuel = new long[(int) cityCount];
        for (int i = 0; i < cityCount; i++) {
            cityFuel[i] = Integer.parseInt(cityFuelToken.nextToken());
        }

        // 여태까지 확보한 최소기름값 저장용 변수
        long currentMin = Integer.MAX_VALUE;
        // 현재 도시 ~ 현재 도시보다 기름값이 싼 도시까지 거리
        long needToGo = 0;
        // 총 주유비
        long totalPrice = 0;
        // 이동하는 횟수만큼만 반복 (마지막 도시에선 계산 필요없음)
        for (int i = 0; i < cityCount - 1; i++) {
            // 현재 도시의 기름값이 여태까지 중 제일 싸다
            if (cityFuel[i] < currentMin) {
                // 여태까지 온 거리만큼 이전 최솟값 도시에서 넣자.
                totalPrice += currentMin * needToGo;
                // 이제 여기가 제일 싸다. 기름값 갱신
                currentMin = cityFuel[i];
                // 여기서부터 출발해서 가야되는 거리
                needToGo = cityDistance[i];
            }
            // 이전 최솟값이 더 싸다.
            else {
                // 다음 도시까지 더 가야된다.
                needToGo += cityDistance[i];
            }
        }
        // 마지막 주유비 계산하고 반환
        return totalPrice + needToGo * currentMin;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new GasStation().solution());
    }

}
