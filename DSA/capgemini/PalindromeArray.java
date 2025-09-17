public class PalindromeArray {

    public static boolean checkPalindrome(int num) {
        String s = Integer.toString(num);
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindromeArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            if(!checkPalindrome(nums[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 111, 121, 222, 333, 444 };
        System.err.println("Output: " + checkPalindromeArray(nums));
    }
}
