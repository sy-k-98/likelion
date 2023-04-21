package com.likelion.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXY() {
        return x == y;
    }

    double getDistance(Point p) {
        int xLength = p.x - this.x;
        int yLength = p.y - this.y;

        double sumOfPow = Math.pow(xLength, 2) + Math.pow(yLength, 2);
        double distance = Math.sqrt(sumOfPow);

        return distance;
    }
}
