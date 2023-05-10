package com.likelion.javaproject2.week4.day3;

public abstract class ShapeDrawer {
    public abstract String makeALine(int h, int i); // 다른 도형들도 그리기 위해서 이 메소드를 추상메소드로 지정

//    public abstract String makeALine(int h, int i) {
//        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
//    }
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }
}
