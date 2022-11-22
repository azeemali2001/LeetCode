class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //mark all the element which are out of bound and mark the presence of one
        boolean one = false;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1)
                one = true;
            
            if(nums[i] > n || nums[i] < 1)
                nums[i] = 1;
        }
        //if one is not present than return here
        if(one == false)return 1;
        
        //manage the presence of each element by using its index
        for(int i=0;i<n;i++){
            int idx = Math.abs(nums[i]);
            
            nums[idx-1] = - Math.abs(nums[idx-1]);
        }
        
        //now check which element leave without marking
        //that will be the first element which is missing
        for(int i=0;i<n;i++){
            if(nums[i] > 0)
                return i+1;
        }
        
        return n+1;
    }
}