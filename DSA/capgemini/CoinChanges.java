import java.util.Arrays;

public class CoinChanges {

    // brute forces
    public static int coinChanges(int coins[], int amount) {
        int count = 0;

        for(int i=coins.length-1; i>=0; i--) {
            if(amount >= coins[i]) {
                count += amount / coins[i];
                amount = amount % coins[i];
            }
        }

        return amount == 0 ? count : -1;
    }

    // efficent aprocch
    public static int coinsChangesUsingDp(int coins[], int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for(int coin : coins) {
            for(int i=coin; i<= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
    }
    
    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 11;
        System.out.println("Number of coins: " + coinChanges(coins, amount));

        System.out.println("number of coins using dp: " + coinsChangesUsingDp(coins, amount));
    }
}
