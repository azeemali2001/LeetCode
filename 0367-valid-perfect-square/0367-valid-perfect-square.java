class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int lo = 1;
        int hi = num/2;
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            
            long sq = (long)mid*mid;
            
            if(sq == num){
                return true;
            } else if(sq < num){
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return false;    
    }
}