class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        boolean canPlant = true;
        for(int i=0;i<flowerbed.length;i++) {
            if(n==0) return true;
            if(flowerbed[i] == 1) {                
                canPlant = false;
                
            } else {
                if(canPlant == true) {
                    if(i<flowerbed.length-1 && flowerbed[i+1] == 0) {
                        n--;
                        canPlant = false;
                    } else if(i==flowerbed.length-1) {
                        n--;
                    }
                } else {
                    canPlant = true;
                }
            }
            
            
        }
        
        return n<=0;
    }
}