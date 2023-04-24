package com.likelion.javaproject2.week2.day1;

public class FloatDigit {
    public static void main(String[] args) {

        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double d10 = 1.23e10;

        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        System.out.println("d10 = " + d10);

        float fPi= 3.141592653589793f;
        double dPi = 3.141592653589793;
        System.out.println("fPi = " + fPi); // 3.1415927 까지만 나옴
        System.out.println("dPi = " + dPi); // 다 나옴

    }
}
