import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static void divider() {
        System.out.printf("------------------------------------------------------------%n%n");
    }

    public static void main(String[] args) {
        System.out.printf("%n%nTesting Start:%n%n");

        divider();

        System.out.printf("Question 1 Tests:%n%n");
        System.out.printf("Testing square method. %nSquare of 4 is: %d%nSquare of 12 is: %d%n%n", Assessment.square(4), Assessment.square(12));
        System.out.printf("Testing overloaded sum methods.%nSum of 4 and 5 is: %d%nSum of 4.5 and 5.5 is: %.1f%n%n", Assessment.sum(4,5), Assessment.sum(4.5, 5.5));
        int[] nums = {5, 10, 15};
        System.out.printf("Testing average method.%nAverage of array [5, 10, 15] is: %.1f%n%n", Assessment.average(nums));

        divider();

        System.out.printf("Question 2 Tests:%n%n");
        Person person1 = new Person("Steve", "Pflug");
        System.out.printf("Creating new person with \"Steve\" and \"Pflug\" passed in.%nFirst Name: %s%nLast Name: %s%n%n", person1.getFirstName(), person1.getLastName());
        System.out.printf("Attempting to create new person with \"Stephen\" and null passed in. This should throw an exception that is caught and handled.%n%n");
        try {
            Person person2 = new Person("Stephen", null);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        divider();

        System.out.printf("Question 3 tests:%n%n");
        System.out.printf("Testing User class constructor. Creating user passing \"steve\", \"Pflug\", true to constructor.%n");
        User user1 = new User("steve", "Pflug", true);
        System.out.printf("First Name: %s%nLast Name: %s%nIs Admin: %s%n%n", user1.getFirstName(), user1.getLastName(), user1.isAdmin());

        divider();

        System.out.printf("Question 4 tests:%n%n");
        System.out.printf("Testing sayHello method implemented from Greeter Interface.%n");
        System.out.printf("Calling method with previous user created:%n%s%n%n", user1.sayHello());

        divider();

        System.out.printf("Question 5 tests:%n%n");
        System.out.printf("Creating user passing \"naz\", \"briseno\", false to constructor.%n");
        User user2 = new User("naz", "briseno", false);
        System.out.printf("First Name: %s%nLast Name: %s%nIs Admin: %s%n", user2.getFirstName(), user2.getLastName(), user2.isAdmin());
        System.out.printf("""
                Creating array list of users containing both users created so far.
                Calling capitalizeRecords method and passing array list created.
                Calling sayHello method on each user in array list to see if names have been capitalized correctly:
                
                """);
        ArrayList<User> users = new ArrayList<>(List.of(user1, user2));
        users = Assessment.capitalizeRecords(users);
        for(User user : users) {
            System.out.println(user.sayHello());
        }
        System.out.printf("%n");

        divider();

        System.out.printf("All Tests Completed.%n%n");
    }
}
