package com.likelion.javaproject2.week4.day1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();

        if (isSufficient) {
            System.out.println("결제하겠습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
