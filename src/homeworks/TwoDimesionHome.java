package homeworks;

import java.util.Random;

/**
 * Created by Shaddowrunner on 17.03.2017.
 */
public class TwoDimesionHome {
    public static void main(String[] args) {
/* 1) Создать два массива из 30 чисел. Первый массив проинициализировать нечетными числами.
        Проинициализировать второй массив элементами первого массива при условии,
        что индекс элемента больше 4 и делится без остатка на 5 и элемент больше 0,
                но меньше 6 или больше 10, но меньше 20.
        Если условие не выполняется оставить элемент массива без изменения. */
        /*int lenght = 60;

        int[] array1 = new int[lenght];
        int[] array2 = new int[lenght];

        for (int condition = 0; condition < lenght; ++condition) {
            array1[condition] = condition * 2 + 1;
            System.out.println(array1[condition]);
        }
        for (int condition = 0; condition < lenght; ++condition) {
            if (condition % 5 == 0 && condition > 4 && array2[condition] > 0 && array2[condition] < 6 || array2[condition] > 10 && array2[condition] < 20) {
                array1[condition] = array2[condition];
            }
            System.out.println(array2[condition] + " ");
        }*/
                       /* a) Использовать тернарный оператор */
      /*//two dimension array

      2) Создать два массива из 5;5 случайных чисел. Первый массив проинициализировать четными числами.
      Проинициализировать второй массив элементами первого массива при условии,
      что индекс делится на 4 без остатка и элемент больше 3, но меньше 16.
      Если условие не выполняется оставить элемент массива без изменения.*/
       /* int[][] twoDimension = new int[5][5];
        int[][] twoDimension2 = new int[5][5];

        Random random = new Random();

        for (int i = 0; i < twoDimension.length; i++) {
            for (int j = 0; j < twoDimension[i].length; ++j) {
//                twoDimension[i][j] = random.nextInt((100 - 25) + 1) + 25;
                twoDimension[i][j] = random.nextInt(16);
//                System.out.print(twoDimension[i][j] + "\t");
            }
            System.out.println();
        }

//        System.out.println("-------");


        for (int i = 0; i < twoDimension2.length; i++) {
            for (int j = 0; j < twoDimension2[i].length; ++j) {
                int element = twoDimension[i][j];
                if (i % 4 == 0 && element > 3 && element < 16) {
                    twoDimension2[i][j] = twoDimension[i][j];
                }
//                System.out.print(twoDimension2[i][j] + "\t");
            }
//            System.out.println();
        }


//        В двумерном массиве случайных чисел определить, сколько раз в нем встречается элемент со значением X.
      /*  int count = 0;
        for (int i = 0; i < twoDimension.length; i++) {
            for (int j = 0; j < twoDimension[i].length; ++j) {
                if (twoDimension[i][j] == 5) {
                    ++count;
                }
            }
        }
//        System.out.println("count of 5 = " + count);*/

        /*System.out.println(Integer.toBinaryString(228));
        System.out.println(Integer.toOctalString(228));
        System.out.println(Integer.toHexString(228));*/

         /*  В двумерном массиве случайных чисел определить
        сколько четных/нечетных элементов содержится и вывести на консоль. */

        int[][] ranDimension = new int[5][5];
        Random random = new Random();

        int count = 0;
        for (int i = 0; i < ranDimension.length; i++) {
            for (int j = 0; j < ranDimension[i].length; ++j) {
                ranDimension[i][j] = random.nextInt(99);
                if (j % 2 == 0) {
                    ++count;
                }
            }
        }
        System.out.print("count of elements/2 = " + count);
    }
}
