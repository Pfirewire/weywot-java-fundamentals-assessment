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

    public static void main(String[] args) {
//        System.out.println(square(4));
//        System.out.println(square(12));
//        System.out.println(sum(4,5));
//        System.out.println(sum(4.5, 5.5));
//        int[] nums = {5, 10, 15};
//        System.out.println(average(nums));
    }

}
