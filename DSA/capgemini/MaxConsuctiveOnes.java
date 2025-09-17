public class MaxConsuctiveOnes {

    public static int findMaxOne(int nums[]) {
        int maxCount = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxOne(nums);
        System.out.println("MaxConsucutive Ones: " + ans);
    }
}
