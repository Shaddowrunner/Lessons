package homeworks.meetings;

import java.nio.file.Files;

/**
 * Created by Shaddowrunner on 07.05.2017.
 */
public class TestMeeting {
    //    psvm
    public static void main(String[] args) {
        // TestMeeting testMeeting = new TestMeeting();
        MeetingService testService = new MeetingService();
        testService.addPerson(new Person(21, Sex.MALE, "John", "Doe", "New-York", 0));
        testService.addPerson(new Person(21, Sex.FEMALE, "Jane", "Parker", "New-York", 0));
//    testService.showPersons();

        testService.lookForPersons("John1", "Doe1");

        System.out.println();

        testService.smartSearchTool(21,0, "New-York", Sex.MALE);


        //testService.lookForPersons();

//  System.out.println();

//    testService.showPersonsByAgeAndOppositeSex();


/*
    System.out.println();

    System.out.println("Persons with the same age");

    System.out.println();

    testService.showPersonsByAgeAndOppositeSex();
*/

        // testService.showOnlyOtherSex();

    }
}
