/*
Problem Name: CountFairSplits

You are given an integer array arr of length n.
arr split is defined as choosing an index i such that the array is divided into two non-empty parts:

Prefix → elements from index 0 to i

Suffix → elements from index i+1 to n-1

arr split is called fair if the difference between the sum of the prefix and the sum of the suffix is even.

Return the number of fair splits possible in the array.

Input

n → integer, size of the array (2 ≤ n ≤ 10^5)

arr → array of integers (0 ≤ arr[i] ≤ 10^9)

Output

An integer representing the number of fair splits.
 */

public class CountFairSplits {

    public static int countFairSplits(int nums[]) {
        int n = nums.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];

            int suffixSum = totalSum - prefixSum;

            if (Math.abs(prefixSum - suffixSum) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 10, 3, 7, 6 };
        System.out.println("Output: " + countFairSplits(nums));
    }
}
