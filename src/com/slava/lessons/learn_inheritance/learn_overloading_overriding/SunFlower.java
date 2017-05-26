package com.slava.lessons.learn_inheritance.learn_overloading_overriding;

import java.io.File;

/**
 * Created by Shaddowrunner on 19.05.2017.
 */
public class SunFlower extends Herbal implements Ballable {

    public void run() {

    }

    @Override
    public void print(String text) {
        System.out.println("SunFlower");
    }

    public void print(String text, int number) {
        System.out.println("SunFlower12" + number);
    }

    @Override
    protected String getCity() {
        return "Kiev";
    }

    protected File getCity(String name, int number) {
        return new File("");
    }

}
