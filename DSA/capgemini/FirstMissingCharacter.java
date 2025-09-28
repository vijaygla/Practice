public class FirstMissingCharacter {

    // approch 1
    public static char firstMissingCharacter(String s) {
        s = s.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                return c;
            }
        }
        return 0;
    }

    // approch 2 using freq arr
    public static char firstMissingCharacter2(String s) {
        s = s.toLowerCase();
        int arr[] = new int[26];

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                arr[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                return (char) (i + 'a');
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "Vijay Kumar";
        char ans = firstMissingCharacter(s);
        char ans2 = firstMissingCharacter2(s);

        System.out.println("First Missing Character: " + ans);
        System.out.println("First Missing Character: " + ans2);
    }
}
