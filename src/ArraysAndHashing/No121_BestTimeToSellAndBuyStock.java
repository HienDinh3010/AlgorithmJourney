package ArraysAndHashing;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
 * in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class No121_BestTimeToSellAndBuyStock {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int l = 0, r = len - 1;
        int min = prices[l], max = prices[r];
        if (len > 2) {
            while (l < r) {
                if (min > prices[l]) {
                    min = prices[l];
                }
                if (max < prices[r]) {
                    max = prices[r];
                }
                l++; r--;
            }
        }
        if (min < max) return max - min;
        return 0;
    }

    public int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int max = 0;
        for (int i = 0 ; i < len - 2; i++) {
            for (int j = len - 1; j > i; j--) {
                int sub = prices[j] - prices[i];
                if (sub > max) {
                    max = sub;
                }
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int l = 0, r = l + 1, maxProfit = 0;
        while (r < len) {
            int profit = prices[r] - prices[l];
            if (profit > 0) {
                if (profit > maxProfit) {
                    maxProfit = profit;
                } else {
                    r++;
                }
            } else {
                l = r;
                r++;
            }
        }
        return maxProfit;
    }
}
