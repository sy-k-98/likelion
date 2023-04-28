package codeup;

import java.util.Scanner;

public class CodeUp1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        double fahrenheit = (double)9 / 5 * celsius + 32;
        System.out.printf("%.3f", fahrenheit);
    }
}
