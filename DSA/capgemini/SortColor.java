import java.util.*;

public class SortColor {

    public static void sortColors(int nums[]) {
        int zero = 0, one = 0, two = 0;
        int index = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zero++;
            }
            else if(nums[i] == 1) {
                one++;
            }
            else {
                two++;
            }
        }
        while (zero-- > 0) {
            nums[index++] = 0;
        }
        while (one-- > 0) {
            nums[index++] = 1;
        }
        while (two-- > 0) {
            nums[index++] = 2;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
