package com.slava.lessons.learn_inheritance;

import homeworks.imitation_arraylist.ImitationArrayList;
import homeworks.meetings.MeetingService;

/**
 * Created by Shaddowrunner on 02.05.2017.
 */
public class Bmw extends Car {
    private String typeOfEngine;

    public Bmw(String color, int age, String typeOfEngine) {
        super(color, age);
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public void showDoor() {

    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public int getNumber() {
        return 15;
    }
}
