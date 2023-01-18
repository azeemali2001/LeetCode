class Solution {
    
    private int kadane(int[] arr) {
        int csum = arr[0];
        int osum = arr[0];
        
        for(int i=1;i<arr.length;i++) {
            int val = arr[i];
            if(csum + val >= val) {
                csum += val;
            } else {
                csum = val;
            }
            
            osum = Math.max(osum,csum);
        }
        
        return osum;
    }
    
    public int maxSubarraySumCircular(int[] nums) {
        int x = kadane(nums);
        
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            nums[i] *= -1;
        }
        
        int y = kadane(nums);
        
        if(sum+y == 0) return x;
        
        return Math.max(x,sum+y);
    }
}