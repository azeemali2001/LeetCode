class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        
        int [] ans = new int[nums.length];
        int a = nums.length-1;
        
        while(i<=j){
            int sqi = nums[i]*nums[i];
            int sqj = nums[j]*nums[j];
            
            if(sqi > sqj){
                ans[a--] = sqi;
                i++;
            } else {
                ans[a--] = sqj;
                j--;
            }
        }
        
        return ans;
    }
}