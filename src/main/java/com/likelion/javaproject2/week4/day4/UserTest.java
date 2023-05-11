package com.likelion.javaproject2.week4.day4;

class UserTest {
    public static void main(String[] args) {
        User user1 = new User("김미미", "010-1234-5678", 18);
        User user2 = new User("김나나", "010-5678-1234", 30);

        System.out.println(user1.getName());
    }

}