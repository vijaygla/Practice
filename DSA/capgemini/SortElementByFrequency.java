import java.util.*;

public class SortElementByFrequency {

    public static void sortElementByFrequency(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while (!map.isEmpty()) {
            int maxFreq = Collections.max(map.values());

            ArrayList<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxFreq) {
                    list.add(entry.getKey());
                }
            }

            Collections.sort(list);

            for (int num : list) {
                for (int i = 0; i < maxFreq; i++) {
                    System.out.print(num + " ");
                }
                map.remove(num);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 4, 2, 4, 1, 3 };
        sortElementByFrequency(nums);
    }
}
