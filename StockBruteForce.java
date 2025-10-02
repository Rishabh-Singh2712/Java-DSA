/*Best Time to Buy and Sell Stock

Problem Statement:

You are given an array prices where prices[i] = price of stock on day i.

You may choose one day to buy and a later day to sell.

Return the maximum profit you can achieve. If no profit is possible, return 0.

Example:

Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy at price = 1 (day 2), sell at price = 6 (day 5), profit = 6 - 1 = 5
*/
package com.DSALearning;

public class StockBruteForce {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        StockBruteForce stock = new StockBruteForce();
        int profit = stock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println("Max Profit: " + profit);
    }
}
