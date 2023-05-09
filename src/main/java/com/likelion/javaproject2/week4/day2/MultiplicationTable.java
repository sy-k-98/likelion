package com.likelion.javaproject2.week4.day2;

public class MultiplicationTable {
    private String multipleSymbol;

    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printMultiplicationTable(int ofN) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", ofN, multipleSymbol, i, ofN * i);
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        MultiplicationTable mt1 = new MultiplicationTable("x");
        mt1.printMultiplicationTable(2);
        mt1.printMultiplicationTable(4);

        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printMultiplicationTable(7);
        mt2.printMultiplicationTable(9);

    }
}
