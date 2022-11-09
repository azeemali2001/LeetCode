class Solution {
    public int maxProfit(int[] prices) {
        int bd = 0;
        int sd = 0;
        
        int ans = 0;
        
        while(sd < prices.length-1){
            if(prices[sd] > prices[sd+1]){
                ans += prices[sd]-prices[bd];
                bd = sd+1;
            }
            sd++;
        }
        
        if(prices[sd] > prices[bd]){
            ans += prices[sd]-prices[bd];
        }
        
        return ans;
    }
}