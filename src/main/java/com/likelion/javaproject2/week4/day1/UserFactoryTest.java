package com.likelion.javaproject2.week4.day1;

public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.getAdultUser();
        System.out.println(user.age);
    }
}
