class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long[] ps = new long[n];
        
        long sum = 0;
        
        for(int i=0;i<ps.length;i++) {
            sum += nums[i];
            ps[i] = sum;
        }
        
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        for(int i=0;i<ans.length;i++) {
            if(i-k < 0 || i+k >= n) continue;
            
            long add = ps[i+k] - ((i-k-1 >= 0) ?  ps[i-k-1] : 0);
            add /= (2 * k + 1);
            ans[i] = (int)add;
        }
        
        return ans;
    }
}