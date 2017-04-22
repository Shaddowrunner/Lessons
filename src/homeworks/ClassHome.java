package homeworks;

/*Создать два класса: первый класс имеет четыре поля, второй - 2 поля.
Создать конструктор, геттеры/сеттеры
Поменять значения полей через сеттеры и вывести поля на консоль.*/

public class ClassHome {
    private int number;
    private int countOfPotato;
    private int numberSecond;
    private int countOfEggs;

    public ClassHome(int newNumber, int newCount, int newNumber2, int newCount2) {//rewrite
        number = newNumber;
        countOfEggs = newCount;
        numberSecond = newNumber2;
        countOfPotato = newCount2;
    }

    public void setCountOfEggs(int newValueCount) {
        if (newValueCount < 0) {
            System.out.println("Incorrect Value");
            countOfEggs = 0;
        } else {
            countOfEggs = newValueCount;
        }
    }

    public int getCountOfEggs() {
        return countOfEggs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumberValue) {
        if (newNumberValue < 0) {
            System.out.println("Incorrect Number");
            number = 0;
        } else {
            number = newNumberValue;
        }

    }

    public int getCountOfPotato() {
        return countOfPotato;
    }

    public void setCountOfPotato(int newValueCount2) {
        if (newValueCount2 < 0) {
            System.out.println("Incorrect Value");
            countOfPotato = 0;
        } else {
            countOfPotato = newValueCount2;
        }
    }

    public int getNumberSecond() {
        return numberSecond;
    }

    public void setNumberSecond(int newNumberSecond) {
        if (newNumberSecond < 0) {
            System.out.println("Incorrect Number");
        } else {
            numberSecond = newNumberSecond;
        }
    }
}
