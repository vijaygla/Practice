import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

    public static int longestSubstringWithoutRepeatingCharacter(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }

    // optimise
    public static int longestSubstringWithoutRepeatingCharacter2(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring without repeating character: " + longestSubstringWithoutRepeatingCharacter(s));

        System.out.println("Output: " + longestSubstringWithoutRepeatingCharacter2(s));
    }
}
