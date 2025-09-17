public class PrintAlternativeElement {

    // iterative method
    public static void printAlternativeElement(int nums[]) {
        for (int i = 0; i < nums.length; i += 2) {
            System.out.print(nums[i] + " ");
        }
    }

    // recursive method
    public static void printAlternative(int nums[], int index) {
        if (index >= nums.length) {
            return;
        }
        System.out.print(nums[index] + " ");
        printAlternative(nums, index + 2);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.print("Alternate Elements: ");
        printAlternativeElement(nums);
        System.err.println();

        System.out.print("Print alternative using recursive method: ");
        printAlternative(nums, 0);
    }
}
