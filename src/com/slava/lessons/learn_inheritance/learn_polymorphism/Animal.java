package com.slava.lessons.learn_inheritance.learn_polymorphism;

/**
 * Created by Shaddowrunner on 07.05.2017.
 */
public class Animal {

    static {
        System.out.println("Static block initialization Animal");//4
    }

    {
        System.out.println("Non - static block initialization Animal");//5
    }

    public Animal() {
        System.out.println("Constructor Animal");
    }//6

    public void sound() {
        System.out.println("Some sound");
    }
}
// 4, 5, 6, 1, 2, 3
