package homeworks.imitation_arraylist;

/**
 * Created by Shaddowrunner on 22.04.2017.
 */
public class TestList {
    public static void main(String[] args) {
        ImitationArrayList list = new ImitationArrayList();
//        System.out.println();
        list.addElement(15);
        list.addElement(1);
        list.addElement(3);
        list.addElement(12);
        list.addElement(17);
        list.addElement(9);
        list.addElement(34);
        list.addElement(5);
        list.addElement(7);


        list.showElementsByRightOrder();

//        list.changeElementByIndex(2,6);

        System.out.println();

//        list.showElementsByInverseOrder();

//        System.out.println();

//        list.decreaseSize(1);

//        System.out.println();

//        list.deleteElement(0);
     //   list.showElementsByRightOrder();

        list.bubbleSort();

        System.out.println();

        list.showElementsByRightOrder();




    }
}
