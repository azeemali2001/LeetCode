class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int N = flowerbed.length;
        int[] arr = new int[N+2];
        
        arr[0] = 0;
        arr[arr.length-1] = 0;
        
        for(int i=0;i<N;i++) {
            arr[i+1] = flowerbed[i];
        }
        
        
        
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i] + arr[i-1] + arr[i+1] == 0) {--n;++i;}
        }
        
        return n <= 0;
    }
}