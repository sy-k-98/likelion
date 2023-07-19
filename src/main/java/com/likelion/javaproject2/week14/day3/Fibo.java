package com.likelion.javaproject2.week14.day3;

public class Fibo {
    public int fiboSimple(int n) {
        if (n < 1)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fiboSimple(n - 1) + fiboSimple(n - 2);
    }

    public int fiboMemo(int n) {
        int[] memo = new int[n + 1];
        return fiboMemoRe(n, memo);
    }

    private int fiboMemoRe(int n, int[] memo) {
        if (n < 1) return 0;
        if (n == 1 || n == 2)
            return 1;
        else {
            if (memo[n] == 0)
                memo[n]
                        = fiboMemoRe(n - 1, memo) + fiboMemoRe(n - 2, memo);
        }
        return memo[n];
    }

    public int fiboTab(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2)
            return 1;

        int[] fib = new int[n + 1];
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(new Fibo().fiboSimple(10));
    }
}
