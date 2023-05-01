package com.likelion.javaproject2.week3.day1;

import java.util.Scanner;

public class ConcatNum {
    public static int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        for(int i : num_list) {
            if (i % 2 == 0) {
                even += i;
            }
            else {
                odd += i;
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;

    }
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};

        System.out.println(solution(num_list));
    }
}
