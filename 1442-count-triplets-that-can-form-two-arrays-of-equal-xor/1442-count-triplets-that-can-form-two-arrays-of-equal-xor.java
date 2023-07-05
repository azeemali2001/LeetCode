class Solution {
    public int countTriplets(int[] arr) {
        int ans = 0;
        
        for(int i=0;i<arr.length;i++) {
            int xori = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                xori = xori ^ arr[j];
                int xorj = arr[j];
                for(int k=j;k<arr.length;k++) {
                    
                    
                    xorj = xorj^arr[k];
                    
                    if(xorj == xori) ans ++;
                }
            }
        }
        return ans;
    }
}