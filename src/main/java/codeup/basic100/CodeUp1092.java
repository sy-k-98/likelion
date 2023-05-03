package codeup.basic100;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int day = 1;

        while (day % first != 0 || day % second != 0 || day % third != 0) {
            day++;
        }
        System.out.println(day);
    }
}
