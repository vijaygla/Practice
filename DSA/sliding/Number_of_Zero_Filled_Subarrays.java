public class Number_of_Zero_Filled_Subarrays {

    public static long number_of_Zero_Filled_Subarrays(int nums[]) {
        long ans = 0;
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                ans = ans + (count * (count + 1)) / 2;
                count = 0;
            }
        }
        ans = ans + (count * (count + 1)) / 2;

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 0, 0, 2, 0, 0, 4 };
        long ans = number_of_Zero_Filled_Subarrays(nums);
        System.out.println("Output: " + ans);
    }
}
