class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int end = -1;
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] < max){
                end = i;
            } else {
                max = nums[i];
            }
        }
        
        int st = -1;
        int min = nums[nums.length-1];
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] > min){
                st = i;
            } else {
                min = nums[i];
            }
        }
        if(end == -1 && st == -1){
            return 0;
        }
        return end-st+1;
    }
}