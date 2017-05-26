package com.slava.lessons.learn_inheritance.learn_polymorphism;

/**
 * Created by Shaddowrunner on 07.05.2017.
 */
public class Dog extends Animal {

    static {
        System.out.println("Static block initialization Dog");//1
    }

    {
        System.out.println("Non - static block initialization Dog");//2
    }

    public Dog() {
        super();
        System.out.println("Constructor Dog");//3
    }

    public void sound() {
        System.out.println("Bow-bow-wow");
    }
}
