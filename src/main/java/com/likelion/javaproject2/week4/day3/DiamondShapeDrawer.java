package com.likelion.javaproject2.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer {
    public static String getRepeatSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String getRepeatSymbolFor(String symbol, int n) {
        String answer = "";

        for (int i = 0; i < n; i++)
            answer += symbol;

        return answer;
    }

    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatSymbol("0", pivot - i), getRepeatSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatSymbol("0", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h = 7;

        ShapeDrawer shapeDrawer = new DiamondShapeDrawer();
        shapeDrawer.printShape(h);
    }
}
