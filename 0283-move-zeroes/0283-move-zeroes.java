class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        int i = 0;
        int j = 1;
        
        while(i < n) {
            if(nums[i] == 0) {
                
                while(j < n && nums[j] == 0) j++;
                
                if(j == n) return;
                
                nums[i] = nums[j];
                nums[j] = 0;
                
                
            } 
            
            i++;
            j = i;
        }
        
        return;
    }
}