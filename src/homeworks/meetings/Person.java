package homeworks.meetings;

/**
 * Created by Shaddowrunner on 07.05.2017.
 */
public class Person {
    private int age;
    private Sex sex;
    private String firstName;
    private String lastName;
    private String city;
    private int countOfChild;
//    add fields, constructor, setter/getter

    public Person(int age, Sex sex, String firstName, String lastName, String city, int countOfChild) {
        this.age = age;
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.countOfChild = countOfChild;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountOfChild() {
        return countOfChild;
    }

    public void setCountOfChild(int countOfChild) {
        this.countOfChild = countOfChild;
    }

    public String toString() {
        String str = getFirstName() + " " + getLastName() + ", " + getAge() + ", " + getSex() + ", " + getCity() + ".";

        return str;
    }


}
