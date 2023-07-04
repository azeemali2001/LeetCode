class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor = 0;
        
        for(int val : nums) {
            xor = (xor ^ val);
        }
        
        
        int mask = xor & (-xor);
        
        int one = 0;
        int zero = 0;
        
        for(int val : nums) {
            if((mask & val) != 0) {
                one = (one ^ val);
            } else {
                zero = (zero ^ val);
            }
        }
        
        ans[0] = one;
        ans[1] = zero;
        
        
        return ans;
    }
}