public class FindThirdHighestValue {

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 10, 2 };

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second || num == third) {
                continue; // skip duplicates
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("Third highest does not exist in the array.");
        } else {
            System.out.println("Third highest value is: " + third);
        }
    }
}
