package com.slava.lessons.learn_class;

public class LearnBlocks {
    private int count;//0
    private String name;//null

    public static int number = 5;

    public static final int value = 40;

   /* {
        System.out.println("Non - static block initialization");
    }*/

    static {
//        System.out.println("Static block initialization");
        System.out.println("Hello");
    }

    public LearnBlocks(int newCount, String newName) {
//        System.out.println("Constructor");
        this.count = newCount;
        this.name = newName;
    }

    public int getCount() {
//        value = 45;
        return count;
    }

    public void setCount(final int count) {
//        count = 5;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        /*LearnBlocks learnBlocks = new LearnBlocks(1, "Hello");//(this, 1, "Hello")
        learnBlocks.setCount(15);
        LearnBlocks.number = 56;
        LearnBlocks learnBlocks1 = new LearnBlocks(12, "Bye");
        learnBlocks1.setCount(15);
        System.out.println(LearnBlocks.number);*/
    }
}
