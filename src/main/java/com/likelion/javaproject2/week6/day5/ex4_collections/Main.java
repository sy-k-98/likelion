package com.likelion.javaproject2.week6.day5.ex4_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names.get(0)); // Alice
        System.out.println(names.size()); // 3
        names.remove("Bob");
        System.out.println(names); // [Alice, Charlie]

        // Set
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // 중복된 요소이므로 추가되지 않음

        System.out.println(fruits.contains("Banana")); // true
        System.out.println(fruits.size()); // 2
        fruits.remove("Apple");
        System.out.println(fruits); // [Banana]

        // Map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 80);
        scores.put("Bob", 90);
        scores.put("Charlie", 75);

        System.out.println(scores.get("Bob")); // 90
        System.out.println(scores.containsKey("Charlie")); // true
        scores.remove("Alice");
        System.out.println(scores); // {Bob=90, Charlie=75}

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.poll()); // A
        System.out.println(queue.peek()); // B
        System.out.println(queue.size()); // 2

        // Stack
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.pop();

    }
}
