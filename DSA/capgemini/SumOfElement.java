import java.util.Arrays;

public class SumOfElement {

    public static int sumRecursive(int nums[], int n) {
        if (n <= 0) {
            return 0;
        }
        return sumRecursive(nums, n - 1) + nums[n - 1];
    }

    public static void sumIterative(int nums[]) {
        int n = nums.length, sum = 0;
        for(int i=0; i<n; i++) {
            sum += nums[i];
        }
        System.out.println("Iterative Sum: " + sum);
    }

    public static void sumUsingInBuildMethod(int nums[]) {
        int sum = Arrays.stream(nums).sum();
        System.out.println("Inbuild Sum: " + sum);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 6 };
        System.out.println("Recursive method where TC: O(n) || AS: O(n)");
        System.out.println("Recursive Sum: " + sumRecursive(nums, nums.length));

        System.out.println("Iterative method where TC: O(n) || AS: O(1)");
        sumIterative(nums);

        System.out.println("Inbuild method where TC: O(n) || AS: O(n)");
        sumUsingInBuildMethod(nums);
    }
}
