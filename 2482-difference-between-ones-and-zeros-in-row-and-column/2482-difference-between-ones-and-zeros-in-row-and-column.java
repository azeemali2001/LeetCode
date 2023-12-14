class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        // we will make two array for storing number of ones in two different array
        // with the help of these two array we will calculate number of zero in each row and each coluumn
        
        int n = grid.length;
        int m = grid[0].length;
        
        int[] row = new int[n];
        int[] col = new int[m];
        
        
        for(int i=0;i<n;i++) {
            int cnt = 0;
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 1) cnt ++;
            }
            
            row[i] = cnt;
        }
        
        for(int j=0;j<m;j++) {
            int cnt = 0;
            for(int i=0;i<n;i++) {
                if(grid[i][j] == 1) cnt ++;
            }
            col[j] = cnt;
        }
        
        
        
        int[][] ans = new int[n][m];
        
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                
                int onesRow = row[i];
                int onesCol = col[j];
                int zeroRow = Math.abs(row[i] - m);
                int zeroCol = Math.abs(col[j]- n);
                
                
                ans[i][j] = onesRow + onesCol - zeroRow - zeroCol;
            }
        }
        
        return ans;
    }
}