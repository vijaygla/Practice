public class ClosestToZero {

    public static void closestToZero(int nums[]) {
        int close = nums[0];

        for(int i=1; i<nums.length; i++) {
            int curr = nums[i];
            if(Math.abs(curr) < Math.abs(close)) {
                close = curr;
            }
            else if(Math.abs(curr) == Math.abs(close) && curr > close) {
                close = curr;
            }
        }
        System.out.println(close);
    }

    public static void main(String[] args) {
        int nums[] = { -2, -5, 3, 2, 6, -3 };
        System.out.print("Closed to zero: ");
        closestToZero(nums);
    }
}
