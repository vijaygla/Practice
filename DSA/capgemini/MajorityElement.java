import java.util.*;

public class MajorityElement {

    public static int majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Collections.max(map.values());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxFreq) {
                return entry.getKey();
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println("Mojority Element: " + ans);
    }
}
