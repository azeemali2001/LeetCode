class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int lo = 0;
        int hi = -1;
        
        for(int val : arr){
            hi = Math.max(hi,val);
        }
        
        if(h == arr.length){
            return hi;
        }
        int speed = Integer.MAX_VALUE;
        
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;        // Avoid overflow
            
            if(isPosssible(arr,mid,h) == true){
                speed = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
            
        }
        
        return speed;
    }
    
    
    public static boolean isPosssible(int[] arr, int mid,int h){
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += (int) Math.ceil(arr[i]*1.0/mid);
        }
        return sum<=h;
    }
    
}