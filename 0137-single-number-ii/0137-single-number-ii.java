class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        
        for(int j=0;j<=32;j++) {
            
            int mask = 1 << j;
            int count = 0;
            
            for(int i=0;i<nums.length;i++) {
                if((nums[i] & mask)== mask) count ++;
            }
            
            if(count % 3 != 0) ans = ans | mask;
        }
        
        return ans;
    }
}