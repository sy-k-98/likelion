package com.likelion.javaproject2.week4.day1;

public class Factor {
    int sumOfFactors(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) sum += i;
        }

        return sum;
    }
    void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        Factor factor = new Factor();
        int result = factor.sumOfFactors(12);

        factor.printResult(12);
        factor.printResult(36);
        factor.printResult(48);
        factor.printResult(29);
    }
}
