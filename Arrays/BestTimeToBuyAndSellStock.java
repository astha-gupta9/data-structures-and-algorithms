// LC 121 - Best Time to Buy and Sell Stock

// Time Complexity: O(n)
// Space Complexity: O(1)

package Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int maxProfit = 0; // store max stock profit
        int minPrice = prices[0]; // store min stock price till now

        // Traverse array
        for (int i = 1; i < prices.length; i++) {

            // update min price
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            // update max stock profit
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit; // Result
    }
}
