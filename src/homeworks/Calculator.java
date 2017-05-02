package homeworks;

/**
 * Создать калькулятор. В классе есть два поля, конструктор, геттеры/сеттеры, методы для калькулятора.
 * Дл каждого действия(+, -, /, *) над полями менять поля через сеттеры.
 */
public class Calculator {
    private int first;//0
    private int second;//0

    public Calculator(int newFirst, int newSecond) {
        this.first = newFirst;
        this.second = newSecond;
    }

    public int plus() {
        return first + second;
    }

    public int minus() {
        return first - second;
    }

    public int multiply() {
        return first * second;
    }


    public int degree() {
        return first / second;
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
      /*

        Before

      Calculator calculator = new Calculator(0, 2);
        calculator.setFirst(8);
        calculator.setSecond(2);
        System.out.println(calculator.plus());
        Calculator minus = new Calculator(0, 3);
        minus.setFirst(15);
        minus.setSecond(3);
        System.out.println(minus.minus());
        Calculator multi = new Calculator(1, 4);
        multi.setFirst(4);
        multi.setSecond(6);
        System.out.println(multi.multiply());
        Calculator degree = new Calculator(2, 6);
        degree.setFirst(128);
        degree.setSecond(32);
        System.out.println(degree.degree());*/

        Calculator calculator = new Calculator(8, 2);

        System.out.println(calculator.plus());

        calculator.setFirst(15);
        calculator.setSecond(3);

        System.out.println(calculator.minus());

        calculator.setFirst(4);
        calculator.setSecond(6);

        System.out.println(calculator.multiply());

        calculator.setFirst(128);
        calculator.setSecond(32);

        System.out.println(calculator.degree());
    }

}
