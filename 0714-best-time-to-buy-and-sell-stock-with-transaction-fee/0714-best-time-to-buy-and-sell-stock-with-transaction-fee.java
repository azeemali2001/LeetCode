class Solution {
    public int maxProfit(int[] prices, int fee) {
        int bs = -1 * prices[0];
        int ss = 0;
        
        for(int i=1;i<prices.length;i++) {
            // Buying State
            int temp = Math.max(bs, ss - prices[i]);
            if(temp > bs) {
                bs = temp;
            }
            
            
            // Selling State
            temp = prices[i] + bs - fee;
            if(temp > ss) {
                ss = temp;
            }
        }
        
        return ss;
    }
}