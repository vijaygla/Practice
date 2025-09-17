public class FindKthElement {

    public static int findKthElement(int nums[], int k) {
        if (k < 0 || k > nums.length) {
            return -1;
        }
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(k + "th element is: " + findKthElement(nums, k));
    }
}
