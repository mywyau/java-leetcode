package leetcode.easy;

/**
 * LeetCode 121 - Best Time to Buy and Sell Stock
 *
 * Problem:
 * Given an array of prices where prices[i] is the price of a stock on day i,
 * return the maximum profit you can achieve by buying and selling once.
 * You must buy before you sell.
 *
 * Approach:
 * - Brute force is O(n²), but too slow.
 * - Greedy approach uses one pass to track:
 * - The lowest price seen so far (minPrice)
 * - The maximum profit if we sell today (price - minPrice)
 * - Time: O(n), Space: O(1)
 */

public class BestTimeBuySellStock {

    // Optimal solution using greedy one-pass strategy
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update the lowest buying price
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit; // update the best profit
                }
            }
        }

        return maxProfit;
    }

    // Brute force (bad) solution - for learning purposes only
    // Time: O(n²), Space: O(1)
    public int maxProfitBad(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
