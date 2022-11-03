class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int i = 0;
        List<List<Integer>> res = new ArrayList<>();
        
        while(i<nums.length-2){
            
            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
            
                int sum = nums[i]+nums[l]+nums[r];

                if(sum==0){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);
                    res.add(ans);
                }

                while(sum <= 0 && nums[l] == nums[++l] && l<r);
                while(sum >= 0 && nums[r] == nums[--r] && l<r);
            }
            while(nums[i] == nums[++i] && i<nums.length-2);
        }
        
        return res;
    }
}