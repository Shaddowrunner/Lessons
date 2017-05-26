package com.slava.lessons.learn_inheritance.learn_overloading_overriding;

import java.io.File;

/*
for class and methods
* private - can be seen only inside class
* default(package - private) - can be seen only inside package
* protected - can be seen only inside package + in childs while inheritance
* public - can be seen anywhere
* */
public class Herbal {

    public void print(String text) {
        System.out.println("Herbal" + text);
    }

    Object getCity() {
        return "Dnepr";
    }

    protected File getCity(String name) {
        return new File("");
    }

}
