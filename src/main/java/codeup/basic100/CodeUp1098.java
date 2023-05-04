package codeup.basic100;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h + 1][w + 1];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            if (d == 0) {
                for (int j = 0; j < l; j++)
                    arr[x][y + j] = 1;
            } else if (d == 1) {
                for (int j = 0; j < l; j++) {
                    arr[x + j][y] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
