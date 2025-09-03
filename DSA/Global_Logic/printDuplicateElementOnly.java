import java.util.HashMap;
import java.util.HashSet;

public class printDuplicateElementOnly {

    // approch 1: using hashmap
    public static void printDuplicateElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    // approch 2: using hashset
    public static void printDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : nums) {
            if(!set.add(num)) {
                duplicate.add(num);
            }
        }
        for(int element : duplicate) {
            System.out.print(element + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 1};
        System.out.print("all the dduplicate element only using hashmap: ");
        printDuplicateElement(nums);
        System.out.println();
        
        System.out.print("all the dduplicate element only using hashset: ");
        printDuplicate(nums);
    }
}
