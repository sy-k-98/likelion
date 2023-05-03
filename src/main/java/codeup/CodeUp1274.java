package codeup;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        if (cnt == 0) System.out.println("prime");
        else System.out.println("not prime");
    }
}
