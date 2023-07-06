class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int i = 0;
        int j = 0;
        
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        
        while(j < nums.length) {
            sum += nums[j];
            
            while(sum >= k) {
                ans = Math.min(ans, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        
        if(ans == Integer.MAX_VALUE) return 0;
        
        return ans;
    }
}