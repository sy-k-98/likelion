package com.likelion.javaproject2.week4.day1;

public class Greet2 {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageWithName(String name, String message) {
        System.out.printf("%s님 %s\n", name, message);
    }

    public static void main(String[] args) {
        Greet2 greet = new Greet2();
        greet.printMessage("안녕하세요.");
        greet.printMessageWithName("김경록", "좋은하루 되세요.");
    }
}
