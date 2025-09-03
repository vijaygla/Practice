public class ReverseDegreeString {

    public static int reverseDegreeString(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            sum += ('z' - s.charAt(i) + 1) * (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        String  s  = "abc";
        int ans = reverseDegreeString(s);
        System.out.println("sum of reverse order of string: " + ans);
    }
}

