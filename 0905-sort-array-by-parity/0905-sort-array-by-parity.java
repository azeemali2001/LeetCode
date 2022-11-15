class Solution {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        
        while(i<nums.length){
            if(nums[i] % 2 == 0){
                swap(nums,i,j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        
        return nums;
    }
}