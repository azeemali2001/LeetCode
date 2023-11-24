class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int i = 0;
        int j = piles.length-1;
        int k = piles.length-2;
        
        int ans = 0;
        
        while(i<k) {
            ans += piles[k];
            
            
            i++;
            j-=2;
            k-=2;
        }
        
        return ans;
    }
}