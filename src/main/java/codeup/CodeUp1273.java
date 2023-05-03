package codeup;

import java.util.Scanner;

public class CodeUp1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.printf("%d ", i);
        }
    }
}
기