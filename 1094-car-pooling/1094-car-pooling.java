class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = -1;
        for(int[] trip : trips){
            n = Math.max(n,trip[2]);
        }
        
        int[] arr = new int[n+1];
        
        for(int i=0;i<trips.length;i++){
            int st = trips[i][1];
            int end = trips[i][2];
            int cap = trips[i][0];
            
            arr[st] += cap;
            arr[end] -= cap;
        }
        if(arr[0] > capacity) return false;
        
        for(int i=1;i<arr.length;i++){
            arr[i] += arr[i-1];
            
            if(arr[i] > capacity){
                return false;
            }
        }
        
        return true;
    }
}