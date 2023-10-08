package slidingWindow.bestTimeToBuyAndSellStock

/**
 * LeetCode: 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
class Solution {
    fun maxProfit(prices: IntArray): Int {
        // 1. O(n^2) solution
        // var maxProfit = 0

        // for (i in 0..prices.lastIndex) {
        //     for (j in i + 1..prices.lastIndex) {
        //         val currentProfit = prices[j] - prices[i]
        //         maxProfit = maxOf(currentProfit, maxProfit)
        //     }
        // }
        // return maxProfit

        // 2. Sliding window solution
        var buy = 0
        var sell = 1
        var maxProfit = 0

        while (sell <= prices.lastIndex) {
            // Profitability check
            if (prices[buy] < prices[sell]) {
                val currentProfit = prices[sell] - prices[buy]
                maxProfit = maxOf(currentProfit, maxProfit)
            } else {
                buy = sell  // Found a low price, so buy price needs to be updated
            }
            sell += 1
        }
        return maxProfit
    }
}