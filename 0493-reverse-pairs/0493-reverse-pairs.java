class Solution {
    static int count;
    public int reversePairs(int[] nums) {
        count = 0;
        merge(nums,0,nums.length-1);
        return count;
    }
    
    public static int[] merge2SortedArray(int[] left,int[] right){
        int[] ans = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < left.length && j < right.length){
            if((long)left[i] >(long) 2 * right[j]){
                count+=left.length-i;
                j++;
            } else {
                i++;
            }
        }
        
        i=0;j=0;
        
        
        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                
                ans[k] = left[i];
                i++;
                k++;
            } else {
                ans[k] = right[j];
                j++;
                k++;
            }
        }
        
        while(i<left.length){
            ans[k++] = left[i++];
        }
        
        while(j<right.length){
            ans[k++] = right[j++];
        }
        return ans;
    }
    
    
    public static int[] merge(int[] arr,int lo,int hi){
        if(lo==hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        
        int mid = (lo+hi)/2;
        
        int[] left = merge(arr,lo,mid);
        int[] right = merge(arr,mid+1,hi);
        
        int[] ans = merge2SortedArray(left,right);
        return ans;
    }
}