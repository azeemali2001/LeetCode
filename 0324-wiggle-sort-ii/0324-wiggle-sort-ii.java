class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return;
        }
        //Sort the Array
        Arrays.sort(nums);
        //Create a new Array and fill the element by managing the equality
        
        int[] ans = new int[n];
        
        int i = n-1;
        int j = 1;
        
        while(i!=-1){
            ans[j] = nums[i];
            
            j+=2;
            i--;
            
            if(j>=nums.length){
                j=0;
            }
        }
        
        for(int a=0;a<n;a++){
            nums[a] = ans[a];
        }
    }
}