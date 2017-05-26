package com.slava.lessons.learn_inheritance;

/**
 * Created by Shaddowrunner on 02.05.2017.
 */
public abstract class Car implements Drivable, Cloneable {
    private String color;
    private int age;

    public static int count = 0;

    public Car(String color, int age) {
        this.color = color;
        this.age = age;
    }

    private String getColor() {
        return color;
    }

    public abstract void showDoor();

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void printModel() {
        System.out.println("Car class");
    }

    public int getNumber() {
        return 5;
    }
}

