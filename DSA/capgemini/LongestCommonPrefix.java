import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String strs[]) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0], last = strs[strs.length - 1];

        for (int i = 0; i < first.length(); i++) {
            if (i < last.length() && first.charAt(i) == last.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String strs[] = { "vijay", "vinay", "vinit" };
        String ans = longestCommonPrefix(strs);
        System.out.println("Output: " + ans);
    }
}
