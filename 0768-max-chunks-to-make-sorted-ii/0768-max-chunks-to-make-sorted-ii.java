class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        //Create rightin
        int[] rmin  = new int[arr.length+1];
        rmin[arr.length] = Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rmin[i] = Math.min(arr[i],rmin[i+1]);
        }
        
        //Traverse the Array and Maintain leftMax and count the chunk
        int lmax = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            lmax = Math.max(lmax,arr[i]);
            
            if(lmax <= rmin[i+1])
                count++;
        }
        
        return count;
    }
}