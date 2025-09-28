public class TwoSumTwo {

    public static int[] twoSumTwo(int nums[], int target) {
        int start = 0, end = nums.length-1;
        while(start < end) {
            if((nums[start] + nums[end]) == target) {
                return new int[] {start+1, end+1};
            }
            else if((nums[start]+nums[end]) < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int result[] = twoSumTwo(nums, target);
        if(result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution");
        }
    }
}
