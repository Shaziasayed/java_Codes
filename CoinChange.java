public class CoinChange {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1, 2, 3};
        int ways = countWays(amount, coins);
        System.out.println("Number of ways to make change: " + ways);
    }

    public static int countWays(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // Base case: There is one way to make change for amount 0

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
    
