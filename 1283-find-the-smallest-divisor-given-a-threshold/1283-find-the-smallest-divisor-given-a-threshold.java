class Solution {
    public int smallestDivisor(int[] arr, int k) {
        int lo = 1;
        int hi = -1;
        for(int val : arr){
            hi = Math.max(hi,val);
        }
        
        if(k==arr.length){
            return hi;
        }
        
        
        int ans = Integer.MAX_VALUE;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            
            if(isPossible(arr,mid,k) == true){
                ans =  mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        
        return ans;
    }
    
    public static boolean isPossible(int[] arr,int mid,int k){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+= (int) Math.ceil(arr[i]*1.0/mid);
        }
        
        return sum <= k;
    }
}