class Solution {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        
        int ans = 0;
        
        for(int i=matrix.length-1;i>=0;i--) {
            for(int j=matrix[0].length-1;j>=0;j--) {
                if(i == matrix.length-1) {
                    dp[i][j] = matrix[i][j];
                } else if(j == matrix[0].length-1) {
                    dp[i][j] = matrix[i][j];
                } else {
                    if(matrix[i][j] == 0) {
                        continue;
                    }
                    int min = Math.min(dp[i][j+1], dp[i+1][j]);
                    min = Math.min(min, dp[i+1][j+1]);
                    dp[i][j] = min + 1;
                }
                ans += dp[i][j];
            }
        }
        
        return ans;
    }
}