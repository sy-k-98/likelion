package codeup.basic100;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);

        for (char c = 'a'; c <= chr; c++) {
            System.out.printf("%c ", c);
        }
    }
}
