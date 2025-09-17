public class ExpandStringByCharacterPosition {

    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        // The number of repetitions is based on the character's positon
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            int repeatTime = c - 'a' + 1;
            for(int j=0; j<repeatTime; j++) {
                sb.append(c);
            }

            if(i < s.length() - 1) {
                sb.append('-');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbbcabd";
        System.out.println(solve(s));
    }
}
