import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static void main(String[] args) {
//        System.out.println(Assessment.square(4));
//        System.out.println(Assessment.square(12));
//        System.out.println(Assessment.sum(4,5));
//        System.out.println(Assessment.sum(4.5, 5.5));
//        int[] nums = {5, 10, 15};
//        System.out.println(Assessment.average(nums));
//        Person person1 = new Person("Steve", "Pflug");
//        System.out.println(person1.getFirstName());
//        System.out.println(person1.getLastName());
//        Person person2 = new Person(null, "Pflug");

        User person = new User("steve", "Pflug", true);
//        System.out.println(person.isAdmin());
//        System.out.println(person1.sayHello());
        User person2 = new User("naz", "briseno", false);
        ArrayList<User> users = new ArrayList<>(List.of(person, person2));
        users = Assessment.capitalizeRecords(users);
        for(User user : users) {
            System.out.printf("%s %s%n", user.getFirstName(), user.getLastName());
        }

    }
}
