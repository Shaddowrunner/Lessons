package com.slava.lessons.learn_enums;

/**
 * Created by Shaddowrunner on 02.05.2017.
 */
public enum Sex {
    MALE("Male"), FEMALE("Female");

    private String shortName;

    Sex(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
