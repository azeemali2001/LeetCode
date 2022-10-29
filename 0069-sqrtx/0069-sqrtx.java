class Solution {
    public int mySqrt(int x) {
        if(x < 2)return x;
        
        int lo = 2;
        int hi = x/2;
        
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            
            long pro = (long)mid*mid;
            
            if(pro == x){
                return mid;
            } else if(pro > x){
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        
        return hi;
    }
}