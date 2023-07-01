class Solution {
    
    private void backtracking(int idx, int[] cookies, int k, int[] children) {
        if(idx == cookies.length) {
            
            int max = 0;
            for(int val : children) {
                max = Math.max(max, val);
            }
            
            ans = Math.min(ans, max);
            return;
        }
        
        int cookie = cookies[idx];
        
        for(int i=0;i<k;i++) {
            children[i] += cookie;
            
            backtracking(idx+1, cookies, k, children);
            
            children[i] -= cookie;
            
            if(children[i]==0) break;
        }
    }
    
    int ans = Integer.MAX_VALUE;
    
    public int distributeCookies(int[] cookies, int k) {
        
        backtracking(0, cookies, k, new int[k]);
        
        return ans;
    }
}