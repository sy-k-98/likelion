package com.likelion.javaproject2.week4.day1;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        si.moveRight();
        System.out.println(si.location);
    }
}
