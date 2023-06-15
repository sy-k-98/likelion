package com.likelion.javaproject2.week9.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixCalculation {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        Stack<Integer> digitStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);

            // 1. 숫자라면, 스택에 push
            if (Character.isDigit(token)) {
                digitStack.push(Character.digit(token, 10));
                // digitStack.push(token - '0');
            }
            // 2. 숫자가 아니라면(연산자), 스택에서 두번 pop하고 계산
            else {
                int numRight = digitStack.pop();
                int numLeft = digitStack.pop();
                switch (token) {
                    case '+' :
                        digitStack.push(numLeft + numRight);
                        break;
                    case '-' :
                        digitStack.push(numLeft - numRight);
                        break;
                    case '*' :
                        digitStack.push(numLeft * numRight);
                        break;
                    case '/' :
                        digitStack.push(numLeft / numRight);
                        break;
                    default:
                        throw new IllegalArgumentException("invalid operator");
                }
            }
        }
        int answer = digitStack.pop();
        if (digitStack.empty())
            System.out.println(answer);
        else System.out.println("error");
    }

    public static void main(String[] args) throws IOException {
        new PostfixCalculation().solution();
    }
}
