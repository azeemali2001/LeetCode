class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int[][] dp = new int[prices.length][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
            
            
        for(int i=1;i<prices.length;i++){
            //Set Buying Price
            int b1 = dp[i-1][1]-prices[i];
            int b2 = dp[i-1][0];
            
            if(b1 > b2){
                dp[i][0] = b1;
            } else {
                dp[i][0] = b2;
            }
            
            
            //Set Selling Price
            int s1 = prices[i]+dp[i-1][0]-fee;
            int s2 = dp[i-1][1];
            
            if(s1 > s2){
                dp[i][1] = s1;
            } else {
                dp[i][1] = s2;
            }
        }
        
        return dp[prices.length-1][1];
    }
}