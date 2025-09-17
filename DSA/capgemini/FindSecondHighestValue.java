public class FindSecondHighestValue {

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 10, 2 };
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second) {
                continue; // skip duplicates
            }

            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second highest does not exist in the array.");
        } else {
            System.out.println("Second highest value is: " + second);
        }
    }
}
