public class AbundantNumber {
    // abundant number:- The number whose divisor sum is greater than the number itself.

    public static boolean isAbundantNumber(int n) {
        int sum = 0;
        for(int i=1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum > n) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        int num = 12;
        System.out.println("Output: " + isAbundantNumber(num));
    }
}

// --------Global logic sql Query--------------
// select mobile_number from employee where mobile_number like "99%";
