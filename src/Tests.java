public class Tests {

    public static void main(String[] args) {
        Person person1 = new Person("Steve", "Pflug");
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        Person person2 = new Person(null, "Pflug");
    }
}
