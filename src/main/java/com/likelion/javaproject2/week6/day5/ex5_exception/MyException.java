package com.likelion.javaproject2.week6.day5.ex5_exception;

public class MyException extends Exception {
    public MyException() {
        super("error");
    }
    public MyException(String message) {
        super(message);
    }
}
