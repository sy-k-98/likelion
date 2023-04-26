package codeup;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        String str1 = value.substring(0, 6);
        String str2 = value.substring(7, 14);

        System.out.println(str1+str2);
    }
}
