package com.likelion.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hi");
        strList.add("Hello");

        for (String str : strList)
            System.out.println(str);
    }
}
