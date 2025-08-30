// package capgemini;

public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicateFromSortedArray(int nums[]) {
        int count = 1; 
        for (int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("Old length: " + nums.length);
        int newLength = removeDuplicateFromSortedArray(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

