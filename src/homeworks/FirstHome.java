package homeworks;

/**
 * Created by Shaddowrunner on 10.03.2017.
 */
public class FirstHome {
    public static void main(String[] args) {
        /*int a = 6;
        int b = 12;

        int sum = a + b;
        int x = a * b;
        int m = b - a;
        int y = b / a;

        System.out.println(sum);
        System.out.println(x);
        System.out.println(m);
        System.out.println(y);

        int c = 10;
        double d = 1.5;

        double x1 = c * d;
        double y1 = c / d;

        System.out.println(x1);
        System.out.println(y1);

        int c1 = 3;
        int d1 = 5;

        int r = ++c1 + d1++;
        System.out.println(r);

        int n = c1 + d1;
        System.out.println(n);

        int[] array = new int[15];

        for (int z = 0; z < array.length; ++z) {
            array[z] = z + 3;
            System.out.println(array[z]);
        }*/

       /* for (int z = 0; z < array.length; ++z) {
            System.out.println(array[z]);
        }*/
/*
        Создать два массива из 20 чисел.
        Первый массив проинициализировать четными числами.
        Проинициализировать второй массив элементами первого массива при условии,
        что индекс делится на 4 без остатка и элемент больше 3, но меньше 16.
        Если условие не выполняется оставить элемент массива без изменения.*/

        int length = 20;

        int[] array2 = new int[length];
        int[] array3 = new int[length];

        for (int k = 0; k < length; ++k) {
            array2[k] = k * 2;// k * 2; k * 2 + 1
            System.out.print(array2[k] + " ");
        }

        System.out.println();

        for (int k = 0; k < length; ++k) {
            if (k % 4 == 0 && array2[k] > 3 && array2[k] < 16) {// ||
                array3[k] = array2[k];
            }
            System.out.print(array3[k] + " ");
        }

        /*
        * 523/8 -> 65, остаток = 3
        * 65/8 -> 8, остаток = 1
        * 8/8 -> 1, остаток = 0
        * 1013(8)
        * */

    }
}
