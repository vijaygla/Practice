public class MaxConsucutiveSubStringOfIndexM {

    public static int[] maxConsucutiveSubStringIndex(String s) {
        int maxCount = 0, count = 0;
        int start = -1, end = -1;
        int currentStart = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'm') {
                if (count == 0) {
                    currentStart = i;
                }
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    start = currentStart;
                    end = i;
                }
            } else {
                count = 0;
            }
        }
        return new int[] { start, end };
    }

    public static void main(String[] args) {
        String s = "mmgmmmm";
        int ans[] = maxConsucutiveSubStringIndex(s);
        System.out.println("Index of maxConsucutive m: " + "[" + ans[0] + ", " + ans[1] + "]");
    }
}
