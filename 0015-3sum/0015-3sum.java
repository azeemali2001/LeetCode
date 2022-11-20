class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length-2){
            int lo = i+1;
            int hi = nums.length-1;
            
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[lo]);
                    temp.add(nums[hi]);
                    
                    ans.add(temp);
                }
                
                while(sum <= 0 && nums[lo] == nums[++lo] && lo < hi);
                while(sum >= 0 && nums[hi] == nums[--hi] && lo < hi);
            }
            
            while(nums[i] == nums[++i] && i < nums.length-2);
        }
        return ans;
    }
}