package com.slava.lessons;

/**
 * Created by Shaddowrunner on 03.03.2017.
 */
public class FirstLesson {
    public static void main(String[] args) {
        //type name = value;
       /* byte b = 20;
        short countOfChildren = 5600;
        int i = 156848;
        long l = 2000L;
        float f = 15.2f;//32 bits
        double d = 12.5;//64 bits
        int d1 = (int) d;//12
        int d2 = b;
        boolean k = true;
        boolean g = false;*/
//        char c = '\u2602';
        /*char c = 'K;*/
//        char c = 9730;
//        System.out.println(c);
        int i = 2;
        int o = 1;
        int s = i + o;

//        int s1 = ++i;//i + 1
//        int s2 = i++;//i + 1
//        System.out.println(++i);
//        System.out.println(i++);
//        System.out.println(i += 2);//i + 2
//        System.out.println(s1);
//        System.out.println(--i);
//        System.out.println(i--);
//        int r = i++ + ++i;
//        System.out.println(r);
//        System.out.println(i);
        int d = 3;

        int y = d;
//        System.out.println(d / i);
//        System.out.println(5 / 2.0);
//        System.out.println(5 % 2);
//        3(10) -> 101
       /* if (d != 5) {
            System.out.println("Incorrect");
        } else{
            System.out.println("Correct");
        }*/

        /*if (d > 5) {
            System.out.println("d != 5");
        } else if (d == 3) {
            System.out.println("d == 3");
        }*/

        int[] array = new int[10];//0
//        int[] array = {1, 2, 3};

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 5;

        int[] array1 = {1, 2, 3, 5};

        /*for (int j = 0; j < 4; ++j) {
            System.out.println(j);
        }*/

        for (int j = 0; j < 10; ++j) {
            array[j] = j + 1;
        }

        for (int j = 0; j < 10; ++j) {
            System.out.println(array[j]);
        }

//        iter1 -> j = 0
//        iter2 -> j = 1

//        System.out.println(array1[2]);
        int b = 1;

        System.out.println(++b);
    }
}
