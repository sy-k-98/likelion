package codeup.basic100;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[23];

        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            arr[n - 1] += 1;
        }

        for (int i = 0; i < 23; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
