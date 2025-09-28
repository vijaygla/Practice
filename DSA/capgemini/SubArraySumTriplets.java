public class SubArraySumTriplets {

    public static int countSpecialTriplets(int nums[]) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] + nums[i + 2] == nums[i + 1]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1, 3, 5, 2, 4, 2 };
        System.out.print("Triplet count: " + countSpecialTriplets(nums));
    }
}
