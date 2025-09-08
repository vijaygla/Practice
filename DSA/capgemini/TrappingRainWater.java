public class TrappingRainWater {

    // brute force O(n^2) || O(1) gfg
    public static int trapBrute(int[] nums) {
        int maxWater = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = 0, end = 0;
            for (int j = 0; j < i; j++) {
                start = Math.max(start, nums[j]);
            }
            for (int j = i; j < nums.length; j++) {
                end = Math.max(end, nums[j]);
            }
            maxWater += Math.max(0, Math.min(start, end) - nums[i]);
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 3, 1, 0, 4 };
        System.out.println("Maximum trapped water: " + trapBrute(nums));
    }
}

