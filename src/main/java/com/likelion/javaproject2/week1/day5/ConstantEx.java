package com.likelion.javaproject2.week1.day5;

import com.likelion.javaproject2.week1.day1.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 1; // 클래스를 인스턴스화 하지 않고도 사용
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
//        iVal = 2; // 값을 바꾸려고 하면 오류
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();

    }
}
