package com.slava.lessons.learn_enums;

/**
 * Created by Shaddowrunner on 02.05.2017.
 */
public class LearnEnums {

    public static void passParamtes(String s) {

    }

    public static void passParamtes1(Sex sx) {

    }

    public static void main(String[] args) {
        String sex = "MalE";//"Female" -> "Meil"

        Sex male = Sex.MALE;

        Sex sexFromUser = Sex.valueOf(sex.toUpperCase());

        Sex[] values = Sex.values();

        for (Sex element : values) {
            System.out.println(element);
        }

//        System.out.println(sexFromUser);

//        System.out.println(male.getShortName());

//        passParamtes1("");
    }
}


