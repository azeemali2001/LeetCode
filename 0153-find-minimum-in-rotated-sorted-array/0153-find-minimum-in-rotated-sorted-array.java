class Solution {
    public int findMin(int[] arr) {
        int lo = 0;
        int hi = arr.length-1;
        if(arr[lo] <= arr[hi]){
            return arr[0];
        }
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            
            if(arr[mid] > arr[mid+1]){
                return arr[mid+1];
            } else if(arr[mid] < arr[mid-1]){
                return arr[mid];
            }else if(arr[mid] > arr[lo]){
                //right Part is unsorted
                lo = mid+1;
            } else {
                // Left Part is unsorted
                hi = mid-1;
            }
        }
        
        return -1;
    }
}