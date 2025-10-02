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


	public class StockOptimal {
	    public int maxProfit(int[] prices) {
	        int minPrice = Integer.MAX_VALUE;
	        int maxProfit = 0;

	        for (int price : prices) {
	            if (price < minPrice) {
	                minPrice = price;  // Update buying price
	            } else if (price - minPrice > maxProfit) {
	                maxProfit = price - minPrice;  // Update profit
	            }
	        }
	        return maxProfit;
	    }

	    public static void main(String[] args) {
	        StockOptimal stock = new StockOptimal();
	        int profit = stock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
	        System.out.println("Max Profit: " + profit);
	    }
	}
