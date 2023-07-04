class Solution {
    public int[] findArray(int[] pref) {
        int xor = 0;
        
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        
        for(int i=1;i<pref.length;i++) {
            xor = (xor^ans[i-1]);
            
            ans[i] = (xor ^ pref[i]);
        }
        
        
        return ans;
    }
}