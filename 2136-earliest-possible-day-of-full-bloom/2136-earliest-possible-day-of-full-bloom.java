class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = plantTime[i];
            arr[i][1] = growTime[i];
        }
        
        Arrays.sort(arr,(a,b)->{
           return b[1]-a[1]; 
        });
        
        
        int plantPosition = 0;
        int growDay = 0;
        for(int i=0;i<n;i++){
            int pT = arr[i][0];
            int gT = arr[i][1];
            
            growDay = Math.max(growDay,plantPosition+pT+gT);
            plantPosition += pT;
        }
        
        return growDay;
        
    }
}