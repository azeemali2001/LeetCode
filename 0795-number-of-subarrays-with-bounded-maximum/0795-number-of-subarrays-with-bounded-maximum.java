class Solution {
    public int numSubarrayBoundedMax(int[] arr, int left, int right) {
        int ans = 0;
        
        int si=0;
        int ei=0;
        
        int prevc = 0;
        
        while(ei < arr.length){
            
            if(left <= arr[ei] && arr[ei] <= right){
                prevc = ei-si+1;
                ans += prevc;
            } else if(arr[ei] < left){
                ans += prevc;
            } else {
                si = ei+1;
                prevc = 0;
            }
            
            ei++;
        }
        
        
        return ans;
    }
}