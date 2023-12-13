class Solution {
    
    private boolean check(int[][] mat, int i, int j) {
        int cnt = 0;
        
        for(int idx=0;idx<mat[0].length;idx++) {
            if(mat[i][idx] == 1) {
                cnt ++;
            }
            
            if(cnt > 1) return false;
        }
        
        cnt = 0;
        
        for(int idx=0;idx<mat.length;idx++) {
            if(mat[idx][j] == 1) {
                cnt ++;
            }
            
            if(cnt > 1) return false;
        }
        
        
        return true;
    }
    
    public int numSpecial(int[][] mat) {
        int ans = 0;
        
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j] == 1) {
                    
                    if(check(mat, i, j)) {
                        
                        ans ++;
                    }
                    break;
                }
            }
        }
        
        return ans;
    }
}