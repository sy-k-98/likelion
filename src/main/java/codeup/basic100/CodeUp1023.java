package codeup.basic100;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] value = sc.next().split("\\.");
        int num1 = Integer.parseInt(value[0]);
        int num2 = Integer.parseInt(value[1]);

        System.out.printf("%d\n%d", num1, num2);
    }
}
