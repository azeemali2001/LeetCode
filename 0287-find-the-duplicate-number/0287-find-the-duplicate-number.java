class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        
        for(int i=0;i<nums.length;i++) {
            int val = Math.abs(nums[i]);
            int idx = val-1;
            if(nums[idx] < 0) {
                ans = val;
                break;
            } else {
                nums[idx] = -1 * nums[idx];
            }
        }
        return ans;
    }
}