// package capgemini;

public class FibonacciSeries {

    // // Iteravtive-------------
    // public static int fib(int n) {
    // if(n <= 1) {
    //     return n;
    // }
    // int a = 0, b = 1;
    // int next = 0;
    // for (int i = 2; i <= n; i++) {
    // next = a + b;
    // a = b;
    // b = next;
    // }
    // return next;
    // }

    // // Recursive---------------
    // public static int fib(int n) {
    // if (n <= 1) {
    // return n;
    // }
    // return fib(n - 1) + fib(n - 2);
    // }

    // optimise using dp--------
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int ans = fib(n);
        System.out.println("Output: " + ans);
    }
}

