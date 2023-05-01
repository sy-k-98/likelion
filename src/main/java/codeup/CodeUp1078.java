package codeup;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;

        for (int i = 0; i <= num ; i += 2) {
            answer += i;
        }
        System.out.println(answer);
    }
}
