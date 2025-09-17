public class FindMissingElement {

    public static int missingNum(int nums[]) {
        int n = nums.length + 1;
        int totalSum = n*(n+1)/2;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        return totalSum-sum;
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 5, 3, 7, 1};  
        System.out.println("Missing number is: " + missingNum(nums));
    }
}
