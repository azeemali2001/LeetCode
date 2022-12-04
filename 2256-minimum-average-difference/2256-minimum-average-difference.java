class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        
        long[] right = new long[n+1];
        right[n-1] = nums[n-1];
        
        for(int i=n-2;i>=0;i--) {
            right[i] = right[i+1] + nums[i];
        }
        
        
        long ssf = 0;
        long pre = Integer.MAX_VALUE;
        int ans = -1;
        
        for(int i=0;i<n;i++) {
            ssf += nums[i];
            
            long first = ssf/(i+1);
            if(i==n-1) {
                if(first < pre) {
                    ans = i;
                }
                break;
            }
            long second = right[i+1]/(n-i-1);
            
            long curr = Math.abs(first-second);
            
            if(curr < pre) {
                pre = curr;
                ans = i;
            }
        }
        
        return ans;
    }
}