package dynamic_programming;

import java.util.Arrays;

public class CoinChange322 {

    public int coinChange(int[] coins, int amount) {

        int INF = amount + 1;
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, INF);
        dp[0] = 0;

        // Build up from 1 → amount
        for (int a = 1; a <= amount; a++) {
            for (int c : coins) {
                if (c <= a) {
                    dp[a] = Math.min(dp[a], dp[a - c] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount]; // ternary operator I think
    }

    public static void main(String[] args) {
        CoinChange322 solver = new CoinChange322();
        System.out.println(solver.coinChange(new int[] { 1, 2, 5 }, 11)); // 3 (5+5+1)
    }
}
