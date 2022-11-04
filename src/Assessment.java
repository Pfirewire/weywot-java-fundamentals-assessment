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

    private static String[] splitWordIntoLetters(String word) {
        return word.split("");
    }

    private static String capitalizeLetter(String letter) {
        return letter.toUpperCase();
    }

    private static String formatName(String name) {
        String[] letterArray = splitWordIntoLetters(name);
        letterArray[0] = capitalizeLetter(letterArray[0]);
        return String.join("", letterArray);
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {
        for(int i = 0; i < users.size(); i++) {
            formatName(users.get(i).getFirstName());
            formatName(users.get(i).getLastName());
        }
        return users;
    }
}
