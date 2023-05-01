package codeup;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int answer = 0;

        for (int i = 1; sum < num; i++) {
            sum += i;
            answer = i;
        }
        System.out.println(answer);
    }

}
