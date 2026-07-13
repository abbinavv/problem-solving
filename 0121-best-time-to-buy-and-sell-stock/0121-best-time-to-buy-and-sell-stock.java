class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], profit = 0, n = prices.length;
        for(int i = 1 ;i<n; i++){
            minPrice = Math.min(minPrice, prices[i]);
            profit=Math.max(profit,prices[i]-minPrice);
        }
        return profit;
    }
}