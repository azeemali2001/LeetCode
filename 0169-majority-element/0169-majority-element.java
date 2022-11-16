class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 1;
        
        for(int i=1;i<nums.length;i++){
            if(val == nums[i]){
                count++;
            } else {
                count--;
            }
            
            if((count == 0) && (i+1 < nums.length)){
                val = nums[++i];
                count = 1;
            }
        }
        
        // val is just a potential majoruty element
        //it may or may not be majoruty element 
        //so we have to check its frequency if it is more than n/2
        //then it is majority element
        //otherwise there is no majority element
        
        //but in the question it is given there is always a majority element exist
        
        return val;
    }
}