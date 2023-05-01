package codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        System.out.println(chr);
        for (char c = 0; chr != 'q'; c++) {
            chr = sc.next().charAt(0);
            System.out.println(chr);
        }
    }
}
