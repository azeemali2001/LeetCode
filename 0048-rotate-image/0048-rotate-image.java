class Solution {
    
    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
    public static void reverse(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int lo = 0;
            int hi = arr[0].length-1;
            
            while(lo < hi){
                int temp = arr[i][lo];
                arr[i][lo] = arr[i][hi];
                arr[i][hi] = temp;
                
                lo++;
                hi--;
            }
        }
    }
    
    public void rotate(int[][] matrix) {
        //Transpose the matrix
        transpose(matrix);
        
        //reverse the matrix
        reverse(matrix);
    }
}