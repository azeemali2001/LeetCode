class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        int cnt = 0;
        
        for(int i=0;i<n;i++) {
            int val = nums[i];
            if(val == 0) {
                cnt ++;
            } else if(cnt > 0){
                nums[i-cnt] = nums[i];
                nums[i] = 0;
            }
        }
    }
}