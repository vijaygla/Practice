import java.util.HashSet;

public class RemoveDuplicateCharacter {

    // using string builder
    public static String removeDuplicateCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        boolean seen[] = new boolean[256];
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();
    }

    // using hashset
    public static String removeUsingSet(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if(!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    
    }

    public static void main(String[] args) {
        String s = "Bootaabble".toLowerCase();
        System.out.println(removeDuplicateCharacter(s));

        System.out.println(removeUsingSet(s)); 
    }
}
