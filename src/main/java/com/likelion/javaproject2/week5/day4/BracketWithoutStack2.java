package com.likelion.javaproject2.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brackets = "(())()";

        while(brackets.indexOf("()") != -1){
            String[] str = brackets.split("\\(\\)");
            brackets = String.join("", str);
        }
        System.out.println(brackets);
    }
}
