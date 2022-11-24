class Solution {
    public int maxSubArray(int[] nums) {
        int csum = nums[0];
        int osum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            int val = nums[i];
            
            if(csum + val >= val){
                csum += val;
            } else {
                csum = val;
            }
            
            if(csum > osum){
                osum = csum;
            }
        }
        
        return osum;
    }
}