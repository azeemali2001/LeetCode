class Solution {
    public int splitArray(int[] arr, int k) {
        if(arr.length < k){
            return -1;
        }
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        
        for(int val : arr){
            lo = Math.max(lo,val);
            hi += val;
        }
        
        int ans = 0;
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            
            if(isPossible(arr,mid,k) == true){
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return ans;
    }
    
    public static boolean isPossible(int[]arr, int mid,int k){
        int sa = 1;
        int sum = 0;
        
        for(int val : arr){
            sum += val;
            
            if(sum > mid){
                sa ++;
                sum = val;
            }
        }
        
        return sa <= k;
    }
}