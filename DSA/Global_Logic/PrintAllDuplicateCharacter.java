import java.util.*;

public class PrintAllDuplicateCharacter {

    // [Approach - 1] Using Sorting - O(n*log(n)) Time and O(1) Space
    public static void printDuplicate(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; ) {
            int count = 1;
            int j = i + 1;
            while (j < arr.length && arr[i] == arr[j]) {
                count++;
                j++;
            }
            if (count > 1) {
                System.out.println(arr[i] + ": " + count);
            }
            i = j; // move to next unique character
        }
    }

    // [Approach - 2] Using Hashing - O(n) Time
    public static void printDuplicateUsingHash(String s) {
        char arr[] = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>(); // keeps insertion order
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s = "vijaykumargupta";

        System.out.println("Duplicate characters using sorting:");
        printDuplicate(s);

        System.out.println("Duplicate characters using hash map:");
        printDuplicateUsingHash(s);
    }
}
