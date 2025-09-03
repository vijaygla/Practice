import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AddNewElementInArray {

    // 2. Using ArrayList as Intermediate Storage
    public static Integer[] addX(Integer arr[], int x) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(x);

        arr = list.toArray(arr);
        return arr;
    }

    public static void main(String[] args) {
        Integer nums[] = { 10, 20, 30, 40, 50};
		int x = 70;
        // call the method to add x in nums
        nums = addX(nums, x);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
