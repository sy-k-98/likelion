package codeup.basic100;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; sum < num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
