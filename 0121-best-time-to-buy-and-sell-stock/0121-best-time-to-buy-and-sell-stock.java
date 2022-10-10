class Solution {
   public int maxProfit(int[] prices) {
        int leastBuyingPrice = Integer.MAX_VALUE;
        int profit = 0;
        int profitIfSoldToday = 0;
        for (int index = 0; index < prices.length; index++) {
            if (prices[index] < leastBuyingPrice) {
                leastBuyingPrice = prices[index];
            }
            profitIfSoldToday = prices[index] - leastBuyingPrice;
            if (profit < profitIfSoldToday) {
                profit = profitIfSoldToday;
            }
        }
        return  profit;
    }
}