package com.slava.lessons.learn_inheritance.learn_modificator.temp_package;


import com.slava.lessons.learn_inheritance.learn_modificator.Table;

/**
 * Created by Shaddowrunner on 12.05.2017.
 */
public class TestModificator {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        Table table = new Table();
        table.print();
//        furniture.print();
    }
}

/*
for class and methods
* private - can be seen only inside class
* default(package - private) - can be seen only inside package
* protected - can be seen only inside package + in childs while inheritance
* public - can be seen anywhere
* */
