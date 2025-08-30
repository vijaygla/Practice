import java.util.HashMap;

public class CountElementWithMaximumFrequency {

    public static int countMaxFrequency(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0, maxCount = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        for (int count : map.values()) {
            if (maxCount == count) {
                ans += count;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 2, 5, 2, 3, 1 };
        System.out.println("Output: " + countMaxFrequency(nums));
    }
}
