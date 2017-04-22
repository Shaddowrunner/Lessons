package homeworks;

/**
 * Created by Shaddowrunner on 07.04.2017.
 */
public class TestHome {
    public static void main(String[] args) {
        ClassHome classHome = new ClassHome(13, 3, 1, 9);
        classHome.setCountOfEggs(4);
        int countOfEggs = classHome.getCountOfEggs();


        classHome.setNumber(1);
        int number = classHome.getNumber();

        System.out.println("type of products" + number);
        System.out.println("count of eggs" + countOfEggs);

        classHome.setCountOfPotato(10);
        int countOfPotato = classHome.getCountOfPotato();

        classHome.setNumberSecond(2);
        int numberSecond = classHome.getNumberSecond();

        System.out.println("type of products" + numberSecond);
        System.out.println("count of eggs" + countOfPotato);

        ClassHome classHome2 = new ClassHome(76, 6, 31, 15);
        classHome2.setCountOfEggs(3);
        int countOfEggs2 = classHome2.getCountOfEggs();


        classHome2.setNumber(55);
        int number2 = classHome2.getNumber();

        System.out.println("type of products" + number);
        System.out.println("count of eggs" + countOfEggs);

        classHome2.setCountOfPotato(7);
        int countOfPotato2 = classHome2.getCountOfPotato();

        classHome2.setNumberSecond(48);
        int numberSecond1 = classHome2.getNumberSecond();

        System.out.println("type of products" + numberSecond1);
        System.out.println("count of eggs" + countOfPotato2);
    }
}
