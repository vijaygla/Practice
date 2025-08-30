// package capgemini;

public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;
        while(num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
