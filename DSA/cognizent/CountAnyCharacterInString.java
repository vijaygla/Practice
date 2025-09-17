public class CountAnyCharacterInString {

    public static void countAnyCharacterInString(String s) {
        int count[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "vijaykumar@&%^gmail.,com";
        countAnyCharacterInString(s);
    }
}
