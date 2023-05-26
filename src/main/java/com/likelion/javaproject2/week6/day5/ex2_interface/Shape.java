package com.likelion.javaproject2.week6.day5.ex2_interface;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();

    default void display() {
        System.out.println("디폴트 메소드");
    }

}
