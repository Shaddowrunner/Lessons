package com.slava.lessons.learn_inheritance;

import java.io.Serializable;

/**
 * Created by Shaddowrunner on 07.05.2017.
 */
//public interface Drivable extends Runnable, Serializable {
public interface Drivable {

    public static final String NAME = "Foo";

//    public abstract void printModel();

//    abstract void printModel();

    public void printModel();

    default int getValue() {
        return 5;
    }

}
