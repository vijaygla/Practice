/*
 * Problem statement
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 */

public class SortArrayByParaty {

    public static void sortArrayByParaty(int nums[]) {
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start++] = temp;
            }
        }

        System.out.print("\nArray after parity:  ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 4 };
        System.out.print("\nArray before parity:  ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        sortArrayByParaty(nums);
    }
}
