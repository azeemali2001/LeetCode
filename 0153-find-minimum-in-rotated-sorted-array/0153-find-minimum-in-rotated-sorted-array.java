class Solution {
    public int findMin(int[] arr) {
        int lo = 0;
        int hi = arr.length-1;
        if(arr[lo] <= arr[hi]){
            // Array is sorted 
                //i.e 0 rotation 
            // here the first element will be the smallest element
            
            return arr[0];
        }
        
        //pivot element always be the smallest element
        
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