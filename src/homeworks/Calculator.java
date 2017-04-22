package homeworks;

/**
 * Создать калькулятор. В классе есть два поля, конструктор, геттеры/сеттеры, методы для калькулятора.
 * Дл каждого действия(+, -, /, *) над полями менять поля через сеттеры.
 */
public class Calculator {
    private int first;
    private int second;

    public Calculator(int newFirst, int newSecond) {
        this.first = newFirst;
        this.second = newSecond;
    }

    public int plus() {
        return first + second;
    }

    public int getPlus() {
        return plus();
    }

    public int minus() {
        return first - second;
    }

    public int getMinus() {
        return minus();
    }

    public int multiply() {
        return first * second;
    }

    public int getMultiply() {
        return plus();
    }

    public int degree() {
        return first * second;
    }

    public int getDegree() {
        return degree();
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Calculator sum = new Calculator(0, 2);
        sum.setFirst(8);
        sum.setSecond(2);
        System.out.println(sum.getPlus());
        Calculator minus = new Calculator(0, 3);
        minus.setFirst(15);
        minus.setSecond(3);
        System.out.println(minus.getMinus());
        Calculator multi = new Calculator(1, 4);
        multi.setFirst(4);
        multi.setSecond(6);
        System.out.println(multi.getMultiply());
        Calculator degree = new Calculator(2, 6);
        degree.setFirst(128);
        degree.setSecond(32);
        System.out.println(degree.getDegree());
    }

}
