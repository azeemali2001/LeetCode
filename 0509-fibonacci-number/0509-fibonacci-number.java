class Solution {
    public int fib(int n) {
        return fib_(n, new int[n+1]);
    }
    
    public int fib_(int n, int[] qb) {
        if(n == 0 || n == 1) {
            return n;
        }
        
        if(qb[n] != 0) {
            return qb[n];
        }
        
        int fibnm1 = fib_(n-1, qb);
        int fibnm2 = fib_(n-2, qb);
        int fibn = fibnm1 + fibnm2;
        
        qb[n] = fibn;
        
        return fibn;
    }
    
}