/*
int arr[] = ["doll", "apple", "sky"]
Exaplanation:
"doll" → remove vowels → "dll" → length = 3 → permutations = 3! = 6

"apple" → remove vowels → "ppl" → length = 3 → permutations = 3! = 6

"sky" → no vowels → "sky" → length = 3 → permutations = 3! = 6
Output: 6
 */

public class MaximumPermutationValues {

    public static int maximumPermutationValuesAfterRemovalOVowel(String arr[]) {
        int maxPermution = 0;

        for (int i = 0; i < arr.length; i++) {
            int consonentCount = countConsonent(arr[i]);
            int permutation = factorial(consonentCount);

            if (permutation > maxPermution) {
                maxPermution = permutation;
            }
        }

        return maxPermution;
    }

    public static int countConsonent(String s) {
        int len = 0;
        for (char c : s.toCharArray()) {
            if(!isVowel(c)) {
                len++;
            }
        }
        return len;
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        String[] arr1 = { "doll", "apple", "sky" };
        int ans = maximumPermutationValuesAfterRemovalOVowel(arr1);
        System.out.println("Output: " + ans);
    }
}
