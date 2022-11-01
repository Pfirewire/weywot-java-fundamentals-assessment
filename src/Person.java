public class Person {
    private String firstName;
    private String lastName;

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

    public Person(String firstName, String lastName) throws IllegalArgumentException {
        if(firstName == null || lastName == null) {
            throw new IllegalArgumentException("First Name and Last Name must not be null");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
