package homeworks.imitation_arraylist;

public class ImitationArrayList {
    private int[] array;

    public ImitationArrayList() {
        array = new int[10];//0 -> 5, 6, 4, 9, 0, 0
    }

    //    1) добавление элементов.

    public void addElement(int value) {
        reSize();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = value;
                break;
            }
        }
    }


    private void reSize() {
        boolean shouldReSize = false;

        for (int element : array) {
            if (element == 0) {
                shouldReSize = true;
                break;
            }
        }

        if (!shouldReSize) {
            int[] temp = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }

    }

//      2) изменение элемента по индексу.

    public void changeElementByIndex(int index, int value) {
        array[index] = value;
    }

    //    вывод элементов в консоль в прямом порядке.
    public void showElementsByRightOrder() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
