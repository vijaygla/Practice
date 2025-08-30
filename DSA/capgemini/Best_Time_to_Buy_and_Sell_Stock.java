// package capgemini;

public class Best_Time_to_Buy_and_Sell_Stock {

    public static int solve(int nums[]) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            minPrice = Math.min(minPrice, nums[i]);
            int profit = nums[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit: " + solve(prices));
    }
}
