package com.likelion.javaproject2.week4.day2;

public class ReversePyramid {
    private String spaceChar = "0";

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(int h, int i){
        return String.format("%s%s", spaceChar.repeat(i),"*".repeat(2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.println(reversePyramid.makeALine(h, i));
        }
    }
}
