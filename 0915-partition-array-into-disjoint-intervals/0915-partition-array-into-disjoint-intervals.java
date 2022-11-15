class Solution {
    public int partitionDisjoint(int[] nums) {
        //Maintain Right min
        int[] rmin = new int[nums.length+1];
        rmin[rmin.length-1] = Integer.MAX_VALUE;
        for(int i=rmin.length-2;i>=0;i--){
            rmin[i] = Math.min(rmin[i+1],nums[i]);
        }
        
        //traverse the array
        int lmax = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            lmax = Math.max(lmax,nums[i]);
            
            if(lmax <= rmin[i+1]){
                ans = i;
                break;
            }
        }
        
        return ans+1;
    }
}