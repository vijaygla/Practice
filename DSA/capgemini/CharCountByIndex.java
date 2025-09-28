import java.util.*;

public class CharCountByIndex {

    public static void countCharacterInStringArray(String words[]) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, word.length());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        System.out.println(map);
    }

    public static void countCharacterInStringArray2(String[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i].length();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ": " + ans[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("Using HashMap:");
        String words[] = { "Vijay", "ram", "Kumar Gupta", "Students" };
        countCharacterInStringArray(words);

        System.out.println("\nUsing Two Arrays:");
        String arr[] = { "Vijay", "ram", "Kumar Gupta", "Students" };
        countCharacterInStringArray2(arr);
    }
}
