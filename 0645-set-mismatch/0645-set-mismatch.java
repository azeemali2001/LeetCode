class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;
        for(int i=1;i<=nums.length;i++){
            xor = (xor ^ i);
        }
        
        for(int val : nums){
            xor = (xor ^ val);
        }
        
        int mask = xor & (-xor);
        
        int num1 = 0;
        int num2 = 0;
        
        for(int i=1;i<=nums.length;i++){
            if((i&mask) == 0){
                num1 = (num1 ^ i);
            } else {
                num2 = (num2 ^ i);
            }
        }
        
        for(int val : nums){
            if((val&mask) == 0){
                num1 = (num1 ^ val);
            } else {
                num2 = (num2 ^ val);
            }
        }
        
        int[] ans = new int[2];
        
        for(int val: nums){
            if(num1 == val){
                ans[0] = val;
                ans[1] = num2;
                break;
            }
            if(num2 == val){
                ans[0] = val;
                ans[1] = num1;
                break;
            }
        }
        
        return ans;
    }
}