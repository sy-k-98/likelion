package codeup;

import java.util.Scanner;

public class CodeUp1256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String star = "*";

        for (int i = 0; i < num; i++) {
            System.out.printf("%s", star);
        }
        //System.out.println(star.repeat(num));
    }
}
