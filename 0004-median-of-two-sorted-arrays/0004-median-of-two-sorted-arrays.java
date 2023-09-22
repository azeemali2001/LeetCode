class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if(a.length > b.length) {
            return findMedianSortedArrays(b, a);
        }
        
        int te = a.length + b.length;
        
        int lo = 0;
        int hi = a.length;
        
        
        while(lo <= hi) {
            
            int aleft = (lo + hi)/2;
            int bleft = ((te + 1) / 2) - aleft;
            
            int alm1 = (aleft == 0) ? Integer.MIN_VALUE : a[aleft-1];
            int al = (aleft == a.length) ? Integer.MAX_VALUE : a[aleft];
            
            int blm1 = (bleft == 0) ? Integer.MIN_VALUE : b[bleft-1];
            int bl = (bleft == b.length) ? Integer.MAX_VALUE : b[bleft];
            
            if(alm1 <= bl && blm1 <= al) {
                // Favourable Condition
                
                double ans = 0.0;
                
                if(te % 2 == 0) {
                    
                    int max = Math.max(alm1, blm1);
                    int min = Math.min(al, bl);    
                    
                    ans = (max + min) / 2.0;
                    
                } else {
                    
                    int max = Math.max(alm1, blm1);
                    
                    ans = max;
                }
                
                return ans;
                
            } else if(alm1 > bl) {
                
                hi = aleft - 1;
                
            } else if(blm1 > al) {
                
                lo = aleft + 1;
            }
        }
        return -1;
    }
}