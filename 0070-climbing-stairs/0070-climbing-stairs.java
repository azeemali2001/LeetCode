class Solution {
    public int climbStairs(int n) {
        
        return climbStairs_mem(n, new int[n+1]);
    }
    
    public int climbStairs_mem(int n, int[] qb) {
        
        if(n == 0) {
            return 1;
        } else if(n < 0) {
            return 0;
        }
        
        if(qb[n] != 0) {
            return qb[n];
        }
        
        int nm1 = climbStairs_mem(n-1, qb);
        int nm2 = climbStairs_mem(n-2, qb);
        
        int cp = nm1 + nm2;
        
        qb[n] = cp;
        
        return cp;
    }
}