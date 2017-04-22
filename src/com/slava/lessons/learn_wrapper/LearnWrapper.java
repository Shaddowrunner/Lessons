package com.slava.lessons.learn_wrapper;

public class LearnWrapper {

    public static int changeValue(Integer integer) {
        return integer += 45;//new Integer(45)
    }

    public static void main(String[] args) {
        int a = 10;
        Integer r = 10;//new Integer(10)
        changeValue(r);
//        System.out.println(r);
        String fromUser = "15";
//        int i = Integer.parseInt(fromUser);
//        System.out.println(Integer.compare(6, 5));
        double d = 12;
//        Double
       /* System.out.println(1 + 2 + "3");
        System.out.println("1" + 2 + 3);*/

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
