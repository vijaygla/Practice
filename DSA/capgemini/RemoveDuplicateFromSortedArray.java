import java.util.*;

public class RemoveDuplicateFromSortedArray {

    // method_1
    public static int removeDuplicateFromSortedArray(int nums[]) {
        int count = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    // using hashset
    public static void removeDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        System.out.println(set);
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 4, 4, 5};
        int count = removeDuplicateFromSortedArray(nums);
        for(int i=0; i<count; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        System.err.print("print using hashset: ");
        removeDuplicate(nums);
    }
}

