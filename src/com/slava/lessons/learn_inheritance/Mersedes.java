package com.slava.lessons.learn_inheritance;

/**
 * Created by Shaddowrunner on 02.05.2017.
 */
public class Mersedes extends Car {//расширение
    private String classOfComfort;

    public Mersedes(String color, int age, String classOfComfort) {
        super(color, age);
        this.classOfComfort = classOfComfort;
    }

    public String getClassOfComfort() {
        return classOfComfort;
    }

    public void setClassOfComfort(String classOfComfort) {
        this.classOfComfort = classOfComfort;
    }

    @Override
    public void showDoor() {

    }
}