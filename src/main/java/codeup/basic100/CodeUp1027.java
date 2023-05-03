package codeup.basic100;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] Arr = str.split("\\.");
        System.out.printf("%s-%s-%s", Arr[2], Arr[1], Arr[0]);
    }
}
