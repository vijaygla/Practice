// package capgemini;

public class MaximumSubarraySum {

    // brute force
    public static int findMaxSubarraySum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    // optimise using kadane algorithm
    public static int findMaxSubarraySumUsingKadane(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, -5, 8, 9 };
        int maxSum = findMaxSubarraySum(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);

        int maxSumUsing = findMaxSubarraySumUsingKadane(nums);
        System.out.println("Maximum Subarray Sum using kadane: " + maxSumUsing);
    }
}
