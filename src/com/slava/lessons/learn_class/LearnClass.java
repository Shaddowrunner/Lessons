package com.slava.lessons.learn_class;

public class LearnClass {
    private int countOfPeople;//field//0
    private int number;//0

    public LearnClass(int newNumber, int newCount) {
        countOfPeople = newCount;
        number = newNumber;
    }

    public void print(int value) {
        System.out.println("Value -> " + value);
    }

    /*public LearnClass() {
    }*/

    public void setCountOfPeople(int newValueCount) {
        int y = 5;
        System.out.println(y);
        if (newValueCount < 0) {
            int y1 = 5;
            System.out.println("Incorrect number");
            countOfPeople = 0;
        } else {
            countOfPeople = newValueCount;
        }

    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public int
    getNumber() {
        return number;
    }

    public void setNumber(int number) {//public void setNumber(this, int number)
       this.number = number;
//       10 = 10;
    }
}
