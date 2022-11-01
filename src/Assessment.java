import java.util.ArrayList;

public class Assessment {

    public static int square(int num) {
        return num * num;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double average(int[] nums) {
        int total = 0;
        for(int num : nums) {
            total += num;
        }
        return (double) total / nums.length;
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {
        for(int i = 0; i < users.size(); i++) {
            String[] firstNameArray = users.get(i).getFirstName().split("");
            firstNameArray[0] = firstNameArray[0].toUpperCase();
            users.get(i).setFirstName(String.join("", firstNameArray));
            String[] lastNameArray = users.get(i).getLastName().split("");
            lastNameArray[0] = lastNameArray[0].toUpperCase();
            users.get(i).setLastName(String.join("", lastNameArray));
        }
        return users;
    }
}
