package homeworks.imitation_arraylist;

public class ImitationArrayList {
    private int[] array;//0

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

    public void deleteElement(int index) {
        int[] temp = new int[array.length - 1];

        for (int i = 0; i < index; ++i) {
            temp[i] = array[i];
        }

        for (int i = index; i < array.length; ++i) {
            if (i == temp.length) {
                break;
            }
            temp[i] = array[i + 1];
        }

        array = temp;
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

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    //2) увеличение листа на заданное количество элементов.

    public void addSize(int newSize) {
        int[] temp = new int[array.length + newSize];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    //3) уменьшение листа до заданного количество элементов.


    public void decreaseSize(int newSize) {
        int[] temp2 = new int[array.length - newSize];//10
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = array[i];
        }
        array = temp2;
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

    public void showElementsByInverseOrder() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    //Cортировка листа(пузырьковая сортировка).

    public void bubbleSort() {

        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] < array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }

        }

    }



}
