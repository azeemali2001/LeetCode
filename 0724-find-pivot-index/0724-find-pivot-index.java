class Solution {
    public int pivotIndex(int[] nums) {
        int rs = 0;
        for(int val : nums) rs += val;
        
        int ls = 0;
        
        for(int i=0;i<nums.length;i++) {
            
            rs -= nums[i];
            
            if(ls == rs) {
                return i;
            }    
            
            ls += nums[i];
            
        }
        return -1;
    }
}