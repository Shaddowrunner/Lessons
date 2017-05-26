package homeworks.meetings;

/**
 * Created by Shaddowrunner on 07.05.2017. Stamina
 */
public class MeetingService {
    private Person[] persons;//null

    public static final int NOT_ALLOWED_AGE_FOR_REGISTRATION = 18;

    public MeetingService() {
        persons = new Person[10];
       /* persons[0] = new Person(21, Sex.FEMALE, "Jane", "Parker", "New-York", 0);
        persons[1] = new Person(21, Sex.MALE, "John", "Doe", "New-York", 0);*/

    }

    public void addPerson(Person person) {
        if (person.getAge() < NOT_ALLOWED_AGE_FOR_REGISTRATION) {
            System.out.println("you're not allowed to authorize");
            return;
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = person;
                break;
            }
        }

        showPersonsByAgeAndOppositeSex(person);
    }

    private void showPersonsByAgeAndOppositeSex(Person person) {
        for (int i = 0; i < persons.length; i++) {
            Person temp = persons[i];
            if (temp != null &&
                    person.getAge() == temp.getAge() &&
                    person.getSex() != temp.getSex()) {
                System.out.println("Persons with same age and opposite sex " + temp);
            }
        }
    }

    public void lookForPersons(String firstName, String lastName) {
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (person != null &&
                    person.getFirstName().equals(firstName) &&
                    person.getLastName().equals(lastName)) {
                System.out.println(person);
            }
        }
    }

    public void smartSearchTool(int age, int countOfChildren, String city, Sex sex) {
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (person != null &&
                person.getAge() == age &&
                    person.getCountOfChild() == countOfChildren &&
                    person.getCity().equals(city) &&
                    person.getSex() == sex
                    ){
                System.out.println(person);
            }
            //System.out.println("Nothing found by your request =(");

        }

    }


}

//domain <- DAO(service) -> database
