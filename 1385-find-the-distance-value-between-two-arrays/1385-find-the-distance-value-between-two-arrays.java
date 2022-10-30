class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        Arrays.sort(arr2);
        
        int count = 0;
        
        for(int i=0;i<arr1.length;i++){
            int val = arr1[i];
            
            int lo = 0;
            int hi = arr2.length-1;
            boolean flag = true;
            
            while(lo <= hi){
                int mid = (lo+hi)/2;
                
                int dif = Math.abs(val-arr2[mid]);
                
                if(dif <= d){
                    flag = false;
                    break;
                } 
                if(arr2[mid] > val){
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}