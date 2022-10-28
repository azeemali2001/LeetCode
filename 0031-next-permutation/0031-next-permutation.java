class Solution {
    
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    public static void reverse(int[] arr, int i,int j){
        while(i<=j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        int i = -1;
        
        for(int idx = nums.length-1;idx>0;idx--){
            if(nums[idx-1] < nums[idx]){
                i = idx-1;
                break;
            }
        }
        
        if(i == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        
        int j = -1;
        for(int idx = nums.length-1;idx>i;idx--){
            if(nums[idx] > nums[i]){
                j = idx;
                break;
            }
        }
        
        
        swap(nums,i,j);
        reverse(nums,i+1,nums.length-1);
        return;
    }
}