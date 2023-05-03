package codeup.basic100;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();
        long num3 = sc.nextInt();
        long sum = num1 + num2 + num3;
        double avg = (double)sum / 3;
        System.out.printf("%d\n%.1f", sum, avg);

    }
}
