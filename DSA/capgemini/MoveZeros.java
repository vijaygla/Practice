public class MoveZeros {

    // brute forces in which i used the extra space
    public static void moveZeros(int nums[]) {
        int temp[] = new int[nums.length];
        int index = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                temp[index++] = nums[i];
            }
        }

        for(int i=index; i<nums.length;  i++) {
            temp[i] = 0;
        }

        for(int t : temp) {
            System.out.print(t + " ");
        }
    }

    // optimise to do this inplace
    public static void moveZerosUsingIndex(int nums[]) {
        int index = 0;
        
        for(int num : nums) {
            if(num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        moveZeros(nums);
        System.out.println();

        moveZerosUsingIndex(nums);
    }
}

