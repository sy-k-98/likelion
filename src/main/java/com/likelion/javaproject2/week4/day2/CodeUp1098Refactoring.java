package com.likelion.javaproject2.week4.day2;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1098Refactoring {
    private int[][] arr;
    private boolean printSeparator;

    public CodeUp1098Refactoring() {
        this.arr = new int[5][5];
        this.printSeparator = true;
    }

    public CodeUp1098Refactoring(boolean printSeparator) {
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }

    public CodeUp1098Refactoring(int row) {
        this.arr = new int[row][5];
    }

    public CodeUp1098Refactoring(int row, int col) {
        this.arr = new int[row][col];
    }

    public void setBar(int l, int d, int x, int y) {
        for (int i = 0; i < l; i++) {
            if (d == 0) {
                arr[x][y + i] = 1;
            } else {
                arr[x + i][y] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        CodeUp1098Refactoring codeUp = new CodeUp1098Refactoring(h, w);

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            codeUp.setBar(l, d, x, y);
        }

        codeUp.printArr();
    }
}
