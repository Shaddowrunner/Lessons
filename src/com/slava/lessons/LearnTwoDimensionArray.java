package com.slava.lessons;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Shaddowrunner on 10.03.2017.
 */
public class LearnTwoDimensionArray {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];//0

        int[][] array2 = {
                {1, 2, 5, 4},
                {4, 5, 8, 15, 18},
                {6, 7, 9},
                {8, 9}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array1[i][j] = i + j;
            }
        }

//        array2[1][4] = 7;

        /*
        first iteration for outer for loop
        * iter1 -> i == 0; j == 0; array2[0][0] == 0
        * iter2 -> i == 0; j == 1; array2[0][1] == 1
        * iter3 -> i == 0; j == 2; array2[0][2] == 2
        *
        second iteration for outer for loop
        * iter1 -> i == 1; j == 0; array2[1][0] == 1
        * iter2 -> i == 1; j == 1; array2[1][1] == 2
        * iter3 -> i == 1; j == 2; array2[1][2] == 3
        * */

        /*for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }*/

       /* int[][] array3 = new int[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = (i + j) * 2 + 1;
            }
        }

        for(int i = 0; i < array3.length; ++i) {
            for(int j = 0; j < array3[i].length; ++j) {
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }*/

        int[] array = new int[5];

       /* for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 80);
        }*/

//        (int)(Math.random() * (max - min) + min)
//        new Random().nextInt((max - min) + 1) + min

       /* for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (48) + 25);//25 - 73
        }*/

        Random random = new Random();

     /*    for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((73 - 25) + 1) + 25;//25 - 73


       /* Random random = new Random();*/

       /* for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(12);
        }*/

        int d = 11;

        /*if (d < 10) {
            d = 15;
        } else {
            d = 20;
        }*/


//        (condition) ? (statement if condition is true) : (statement if condition is false);

        d = d < 10 ? 15 : 20;

        /*if (d == 11) {
            d = 11;
        } else {
            d = 11;
        }*/

        System.out.println(d);


    }
}

/*
*   1 2
*   8 7
*
* */
