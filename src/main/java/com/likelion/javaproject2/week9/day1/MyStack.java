package com.likelion.javaproject2.week9.day1;

public class MyStack {
    // stack에 실제 데이터가 저장되는 곳
    private final int[] arr = new int[16];

    // 현재 스택의 최고점을 파악하기 위한 top
    private int top = -1;

    public MyStack() {
    }

    // push : 데이터를 스택의 제일 위에 넣는 메소드
    public void push(int data) {
        // 0. arr가 가득 찼는지 판단한다.
        if (arr.length - 1 == top) {
            throw new RuntimeException("stack is full");
        }
//        // 1. top을 하나 증가시킨다.
//        top++;
//        // 2. arr[top]에 data를 할당한다
//        arr[top] = data;

        // 1, 2 한번에
        arr[++top] = data;
    }

    // pop : 데이터를 스택의 제일 위에서 회수하는 메소드
    public int pop() {
        // 0. arr가 비어있는지 판단한다.
        if (top == -1) {
            throw new RuntimeException("stack is empty");
        }
//        // 1. arr[top]의 값을 임시 저장한다.
//        int temp = arr[top];
//        // 2. top의 값을 하나 감소한다.
//        top--;
//        // 3. 임시 저장한 값을 반환한다.
//        return temp;

        // 1~3 한번에
        return arr[top--];
    }

    // peek : 제거하지 않고 스택의 제일 위의 데이터를 반환하는 메소드
    public int peek() {
        // 0. arr가 비어있는지 판단한다.
        if (top == -1) {
            throw new RuntimeException("stack is empty");
        }
        // 1. arr[top]을 반환한다.
        return arr[top];
    }

    // empty : 스택이 비어있는지 확인한다.
    public boolean empty() {
        // 스택의 top이 -1이면 비어있는 것이다.
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack intStack = new MyStack();
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.empty());
        System.out.println(intStack.peek());
    }
}
