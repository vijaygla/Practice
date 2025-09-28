/*
Problem: Minimum Cost to Transform String

You are given two strings S1 and S2 consisting of uppercase English letters.
You want to transform S1 into S2 using the following operations:

Add Operation: You may append any character to the end of S1. (Cost = 1)

Swap Operation: You may swap the last added character with any of the existing characters in S1. (Cost = 1)

Return the minimum cost required to transform S1 into S2.

Input Specification

input1: A string S1 (1 ≤ |S1| ≤ 1000)

input2: A string S2 (1 ≤ |S2| ≤ 1000)

Both strings consist of uppercase English letters.

Output Specification

Return an integer representing the minimum cost required to transform S1 into S2.
 */
public class MinimumCostToTransferString {

    public static int minCostToTransfer(String s1, String s2) {
        if (s1 == s2) {
            return 0;
        }

        int i = 0, j = 0;
        int cost = 0;

        while (i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            }
            else {
                cost++;
                j++;
            }
        }

        if(j < s2.length()) {
            cost += (s2.length() - j);
        }

        return cost;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "yabd";
        int cost = minCostToTransfer(s1, s2);
        System.out.println("Minimum cost to transfer string: " + cost);// 2
    }
}
