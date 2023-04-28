package codeup;

import java.util.Scanner;

public class CodeUp1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        int minute = second / 60;
        second = second % 60;
        System.out.print(minute + " " + second);
    }
}
