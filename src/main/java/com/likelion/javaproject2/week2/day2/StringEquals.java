package com.likelion.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");
        // 메모리주소끼리 비교하기 때문에 같다

        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());

        //str1의 G와 str2가 같은지?
        boolean isSame = str1.substring(0, 1) == str2;
        boolean isEqual = str1.substring(0, 1).equals(str2);
        System.out.println(isSame);
        System.out.println(isEqual);
    }
}
