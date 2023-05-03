package codeup.basic100;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();
        int num = Integer.parseInt(alphabet, 16);

        for (int i = 1; i < 16 ; i++) {
            System.out.printf("%X*%X=%X\n", num, i, num * i);
        }
    }
}
