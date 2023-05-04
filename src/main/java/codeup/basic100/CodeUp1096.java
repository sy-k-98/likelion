package codeup.basic100;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[19][19];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x - 1][y - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
