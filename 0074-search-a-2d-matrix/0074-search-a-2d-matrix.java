class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int pr = -1;
        int lo = 0;
        int hi = matrix.length-1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target >= matrix[mid][0]  && target <= matrix[mid][matrix[0].length-1]){
                pr = mid;
                break;
            } else if(target < matrix[mid][0]){
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        
        if(pr == -1)return false;
        
        lo = 0;
        hi = matrix[0].length-1;
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(target == matrix[pr][mid]){
                return true;
            } else if(target > matrix[pr][mid]) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        
        return false;
    }
}