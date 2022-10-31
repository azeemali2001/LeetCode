class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //checking lower Triangle
        for(int r=0;r<matrix.length;r++){
            int i = r+1;
            int j = 0+1;
            
            int pre = matrix[r][0];
            while(i<matrix.length && j<matrix[0].length){
                if(matrix[i][j] == pre){
                    pre = matrix[i][j];
                } else {
                    return false;
                }
                i++;
                j++;
            }
        }
        
        //checking upper triangle
        for(int c=1;c<matrix[0].length;c++){
            int i = 0+1;
            int j = c+1;
            
            int pre = matrix[0][c];
            while(i<matrix.length && j<matrix[0].length){
                if(matrix[i][j] == pre){
                    pre = matrix[i][j];
                } else {
                    return false;
                }
                i++;
                j++;
            }
        }
        
        return true;
    }
}