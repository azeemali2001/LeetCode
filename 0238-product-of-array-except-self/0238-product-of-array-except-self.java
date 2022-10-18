class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] right = new int[nums.length];
        right[right.length-1] = nums[nums.length-1];
        
        for(int i=nums.length-2;i>=0;i--){
            right[i] = (right[i+1] * nums[i]);
        }
        
        int lp = 1;
        int[] res = new int[nums.length];
        
        for(int i=0;i<res.length-1;i++){
            res[i] = lp*right[i+1];
            lp = lp * nums[i];
        }
        res[nums.length-1] = lp;
        return res;
    }
}