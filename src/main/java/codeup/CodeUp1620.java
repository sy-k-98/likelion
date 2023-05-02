package codeup;

import java.util.Scanner;

public class CodeUp1620 {
    public static int addDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitSum = addDigit(n);

        while(digitSum >= 10) {
            digitSum = addDigit(n);
            n = digitSum;
        }
        System.out.println(digitSum);
    }
}
