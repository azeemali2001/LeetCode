class Solution {
    public int maxProduct(int[] nums) {
        //weither our answer willl be starting part of the array 
        //or it will be ending part of the array
        //if we don't encounter with zero
        
        //if zero comes === start from that point and maintaining the subarray
        
        int cprod = 1;
        int ans  = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            cprod *= nums[i];
            ans = Math.max(ans,cprod);
            
            if(cprod == 0) 
                cprod = 1;
        }
        
        cprod = 1;
        
        for(int i=nums.length-1;i>=0;i--){
            cprod *= nums[i];
            ans = Math.max(ans,cprod);
            
            if(cprod == 0) 
                cprod = 1;
        }
        
        return ans;
    }
}