import java.util.*;

public class MergeTwoSortedArray {

    // Approach 1: Brute Force (merge + sort)
    public static int[] mergeBrute(int nums1[], int n, int nums2[], int m) {
        int ans[] = new int[n + m];
        for (int i = 0; i < n; i++) {
            ans[i] = nums1[i];
        }
        for (int j = 0; j < m; j++) {
            ans[n + j] = nums2[j];
        }
        Arrays.sort(ans);
        return ans;
    }

    // Approach 2: Better (Two Pointers)
    public static int[] mergeTwoPointer(int nums1[], int n, int nums2[], int m) {
        int ans[] = new int[n + m];
        int i = 0, j = 0, index = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                ans[index++] = nums1[i++];
            } else {
                ans[index++] = nums2[j++];
            }
        }
        while (i < n) {
            ans[index++] = nums1[i++];
        }
        while (j < m){
            ans[index++] = nums2[j++];
        }
        return ans;
    }

    // Approach 3: Optimal In-Place Merge
    public static void mergeInPlace(int nums1[], int n, int nums2[], int m) {
        int i = n - 1;
        int j = m - 1;
        int index = n + m - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[index--] = nums2[j--];
            } else {
                nums1[index--] = nums1[i--];
            }
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3, 5 };
        int nums2[] = { 2, 4, 6 };
        int n = nums1.length;
        int m = nums2.length;

        // Method 1: Brute Force
        int ans1[] = mergeBrute(nums1, n, nums2, m);
        System.out.print("Merging using brute force approach:------------>");
        for (int num : ans1)
            System.out.print(num + " ");
        System.out.println();

        // Method 2: Better (Two Pointers)
        int ans2[] = mergeTwoPointer(nums1, n, nums2, m);
        System.out.print("Merging using better (two-pointer) approach:--->");
        for (int num : ans2)
            System.out.print(num + " ");
        System.out.println();

        // Method 3: In-Place Merge
        int nums3[] = { 1, 3, 5, 0, 0, 0 }; // extra space for merge
        mergeInPlace(nums3, 3, nums2, m);
        System.out.print("Merging using optimal in-place approach:------->");
        for (int num : nums3)
            System.out.print(num + " ");
        System.out.println();
    }
}
