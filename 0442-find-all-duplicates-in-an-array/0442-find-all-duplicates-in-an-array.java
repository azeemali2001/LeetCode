class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;
            int val = nums[idx];
            if(val < 0) {
                //duplicacy encounter
                ans.add(idx+1);
            } else {
                //mark it
                nums[idx] *= -1;
            }
        }
        return ans;
    }
}