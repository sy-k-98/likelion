package com.likelion.javaproject2.week6.day5.ex1_abstract;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();

        Bird bird = new Bird();
        bird.makeSound();
        //bird.run();
    }
}
