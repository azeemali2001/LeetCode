class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int lo = 0;
        int hi = 0;
        
        for(int val : nums){
            lo = Math.max(lo,val);
            hi += val;
        }
        
        if(nums.length == days){
            return lo;
        }
        
        int ans = 0;
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            
            if(isPossible(nums,mid,days) == true){
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        
        return ans;
    }
    
    public static boolean isPossible(int[] nums,int mid, int days){
        int day = 1;
        int sum = 0;
        
        for(int val : nums){
            sum += val;
            if(sum > mid){
                sum = val;
                day++;
            }
        }
        
        return day <= days;
    }
}