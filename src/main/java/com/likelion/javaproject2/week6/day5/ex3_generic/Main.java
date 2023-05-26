package com.likelion.javaproject2.week6.day5.ex3_generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> T getFirstItem(List<T> list) {
        if (list.isEmpty())
            return null;
        return list.get(0);
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(10);
        int value = intBox.getItem();
        System.out.println(value);

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        String firstElement = getFirstItem(stringList);
        System.out.println(firstElement);
    }
}
