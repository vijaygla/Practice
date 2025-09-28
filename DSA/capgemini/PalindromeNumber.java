// package capgemini;

public class PalindromeNumber {

    public static boolean checkPalindrome1(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse == original;
    }

    // method 2
    public static boolean checkPalindrome2(int num) {
        String s = Integer.toString(num);
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // approch 3
    public static boolean checkPalindrome3(int num) {
        String s = String.valueOf(num);

        int start = 0, end = s.length()-1;
        while (start < end) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 121;
        
        System.out.println("Output: " + checkPalindrome1(num));

        System.out.println("Output: " + checkPalindrome2(num));
        
        System.out.println("Output: " + checkPalindrome3(num));
    }
}
