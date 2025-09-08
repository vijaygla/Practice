// package capgemini;

import java.util.HashMap;

public class MaximumSubarraySumEqualK {

    // TC: O(n^2)
    public static int maximumSubarraySumEqualK(int nums[], int k) {
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            int sum = 0;
            for(int j=i; j<nums.length; j++) {
                sum += nums[j];

                if(sum == k) {
                    count++;
                }
            }
        }
        
        return count;
    }

    // TC: O(n), AS: O(n)
    public static int maximumSubarraySumEqualKUsingHashMap(int nums[], int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case sum = 0 occur once

        for(int num : nums) {
            sum += num;

            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,1};
        int k = 3;
        int maxSum = maximumSubarraySumEqualK(nums, k);
        System.out.println("Maximum Subarray Sum Equal to K: " + maxSum);


        System.out.println("Maximum Subarray Sum Equal to K using hashmap: " + maximumSubarraySumEqualKUsingHashMap(nums, k));
    }
}
