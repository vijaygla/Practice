import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

    public static int longestSubstringWithoutRepeatingCharacter(String s) {
        int maxLen = Integer.MIN_VALUE;

        for(int i=0; i<s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=i; j<s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring without repeating character: " + longestSubstringWithoutRepeatingCharacter(s));
    }
}

