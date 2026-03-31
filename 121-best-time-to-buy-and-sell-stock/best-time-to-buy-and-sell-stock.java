class Solution {
    public int maxProfit(int[] prices) {

        // int profit = 0, buy = Integer.MAX_VALUE, post = 0;

        // if(prices.length == 1){
        //     return 0;
        // }

        // for (int i = 0 ; i < prices.length; i++) {
        //     if (buy > prices[i]) {
        //         buy = prices[i];
        //         post = i;
        //     }

        // }
        // for (int i = post; i < prices.length; i++) {
            
        //     if (profit < prices[i]) {
        //         profit = prices[i];
        //     }
        // }
        // return profit - buy;
        int Buy = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > Buy) {
                profit = Math.max(profit, prices[i] - Buy);
            }
            Buy = Math.min(prices[i], Buy);
        }
        return profit;
    }
}