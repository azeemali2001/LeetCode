class Solution {
    public int search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] >= arr[lo]){
                // Low to mid Part is Sorted
                if(arr[lo] <= target && arr[mid] > target){
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            } else if(arr[hi] >= arr[mid]){
                // Mid to High part is Sorted
                if(arr[mid] < target && arr[hi] >= target){
                    lo = mid+1;
                } else {
                    hi = mid-1;
                }
            }
        }
        
        return -1;
    }
}