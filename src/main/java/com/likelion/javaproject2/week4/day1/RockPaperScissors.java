package com.likelion.javaproject2.week4.day1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // win, tie, lose
    public String play(int user, int computer) {
        // 0바위 1가위 2보
        if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }
    public int getRandRange(int from, int to) {
        Random ran = new Random();
        return from + ran.nextInt(to - from + 1);
    }
    public String getRockScissorPaper(int num) {
        return switch(num){
            case 0 -> "바위";
            case 1 -> "가위";
            case 2 -> "보";
            default -> throw new IllegalArgumentException("입력하신" + num + "는 없습니다");
        };
    }

    public int getRockSessionPaperNum(String str) {
        return switch (str) {
            case "바위" -> 0;
            case "가위" -> 1;
            case "보" -> 2;
            default -> throw new IllegalArgumentException("입력하신 " + str + "는 없습니다");
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperScissors rpc = new RockPaperScissors();
        int iRps;
        String playResult;
        System.out.println("이길때까지 하는 가위바위보 게임!");
        do {
            System.out.printf("가위 바위 보 중 하나를 내세요:");
            iRps = rpc.getRockSessionPaperNum(sc.nextLine());
            playResult = rpc.play(iRps, rpc.getRandRange(0, 2));
            System.out.println(playResult);
        } while (!"win".equals(playResult));
    }
}