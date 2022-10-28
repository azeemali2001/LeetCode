class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]) return 0;
        if(target > nums[nums.length-1]) return nums.length;
        int lo = 0;
        int hi = nums.length-1;
        
        int ans = 0;
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                hi = mid-1;
            } else if(nums[mid] < target){
                lo = mid+1;
            }
        }
        
        return lo;
        
    }
}