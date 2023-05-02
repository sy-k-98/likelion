package codeup;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while(n > 0) {
            n /= 10;
            answer += 1;
        }

        System.out.println(answer);
    }
}
