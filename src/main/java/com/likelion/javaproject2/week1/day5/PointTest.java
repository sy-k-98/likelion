package com.likelion.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXY());

        // 또 다른 점 찍기
        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("xy가 같은지? %s\n", p2.isSameXY());

        // 또 다른 점 찍기
        Point p3 = new Point();
        p3.x = 3;
        p3.y = 2;
        System.out.printf("xy가 같은지? %s\n", p3.isSameXY());


        double result = p2.getDistance(p3);
        System.out.printf("두 점 사이의 거리 : %f", result);
    }


}
