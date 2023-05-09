package com.likelion.javaproject2.week4.day2;

public class Pyramid {
    /*
    // 기능이 3가지 (출력 / 1줄만들기 / 반복) -> 분리
    public void printPyramidWithSpaceChar(int height, String spaceChar) {

        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

    // 1줄 만드는 기능만 분리 -> spaceChar 변수를 파라미터로 계속 들고 다녀야 함
    public String makeALine(String spaceChar, int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        // 기능이 3가지
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(spaceChar, height, i));
        }
    }
    */

    // 멤버 변수를 참조하게 변경
    private String spaceChar = "0";

    public Pyramid(String spaceChar){
        this.spaceChar = spaceChar;
    }

    // makeALine + printPyramidWithSpaceChar
    public void printPyramid(int height){
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(" ");
        Pyramid pyramidSpaceZero = new Pyramid("0");
        pyramid.printPyramid(4);
        pyramid.printPyramidWithSpaceChar(3, "%");
        pyramidSpaceZero.printPyramid(5);

    }
}
