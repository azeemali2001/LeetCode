class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] rp = new int[n];
        rp[n-1] = nums[n-1];
        
        for(int i=n-2;i>=0;i--) {
            rp[i] = rp[i+1] * nums[i];
        }
        
        int[] ans = new int[n];
        
        int lp = 1;
        for(int i=0;i<n-1;i++) {
            ans[i] = lp*rp[i+1];
            
            lp = lp*nums[i];
        }
        
        ans[n-1] = lp;
        
        return ans;
        
    }
}