package com.likelion.javaproject2.week3.day1;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 11;
        int lastDate = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("잘못된 월:" +  month);
        };
        System.out.println(lastDate);
    }
}
