package com.slava.lessons.learn_class;

public class TestClass {
    public static void main(String[] args) {
        //type_of_reference name_of_reference = new type_of_reference();
        LearnClass learnClass = new LearnClass(41, 87);
//        LearnClass learnClass = new LearnClass();
        learnClass.setCountOfPeople(15);//learnClass.setCountOfPeople(this, -15);
        learnClass.setNumber(88);//learnClass.setNumber(this, 88);
        int countOfPeople = learnClass.getCountOfPeople();
        int number = learnClass.getNumber();
//        learnClass.print(44);
//        learnClass.setCountOfPeople(33);
//        System.out.println(countOfPeople);
//        System.out.println("Number = " + number);

//        learnClass.number = 25;

        LearnClass learnClass1 = new LearnClass(11, 63);
        learnClass1.setCountOfPeople(1);
        learnClass1.setNumber(6);
//        learnClass1.print(44);

    }
}
