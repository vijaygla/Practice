public class CountNumberOfCharacterInString {

    public static void countNumberCharacter(String s) {
        int count[] = new int[26];

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        for(int i=0; i<26; i++) {
            if(count[i] > 0) {
                System.out.println((char) (i + 'a') +": " +  count[i]);
            }
        }
    }

    public static void countNumberOfCharacterInString(String s) {
        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count[s.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "vijay kumar gupta";
        countNumberOfCharacterInString(s);

        System.out.println("method 2----------------------");
        countNumberCharacter(s);
    }
}

