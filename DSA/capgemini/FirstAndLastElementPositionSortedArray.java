public class FirstAndLastElementPositionSortedArray {

    public static void printIndex(int nums[], int target) {
        int first = -1, last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("First index: " + first);
        System.out.println("Last index: " + last);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 5, 5, 5, 6, 7 }; // sorted array will provide to you
        int target = 5;
        printIndex(nums, target);
    }
}
