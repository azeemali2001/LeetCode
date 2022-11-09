class Solution {
    public int maxProfit(int[] prices) {
        int bd = 0;
        int sd = 0;
        
        int ans = 0;
        
        while(sd < prices.length){
            if(prices[sd] < prices[bd]){
                bd = sd;
            } else {
                ans = Math.max(ans,prices[sd]-prices[bd]);    
            }
            sd++;
        }
        
        return ans;
    }
}