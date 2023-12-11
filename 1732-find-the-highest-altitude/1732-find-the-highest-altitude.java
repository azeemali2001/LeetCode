class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int ans = max;
        
        for(int i=0;i<gain.length;i++) {
            max += gain[i];
            
            ans = Math.max(ans, max);
        }
        
        return ans;
    }
}