class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        
        //count1 = number of swapping required to make top array as num1
        //count2 = number of swapping required to make bottom array as num1
        
        //count3 = number of swapping required to make top array as num2
        //count4 = number of swapping required to make bottom array as num2
        
        int val1 = tops[0];
        int val2 = bottoms[0];
        
        for(int i=0;i<tops.length;i++){
            
            if(count1 != Integer.MAX_VALUE){
                if(tops[i] == val1){
                    //nothing to do
                } else if(bottoms[i] == val1){
                    count1 ++;
                } else {
                    count1 = Integer.MAX_VALUE;
                }
            }
            
            if(count2 != Integer.MAX_VALUE){
                if(bottoms[i] == val1){
                    // nothing to do
                } else if(tops[i] == val1){
                    count2 ++;
                } else {
                    count2 = Integer.MAX_VALUE;
                }
            }
            
            if(count3 != Integer.MAX_VALUE){
                if(bottoms[i] == val2){
                    //nothing to do
                } else if(tops[i] == val2){
                    count3 ++;
                } else {
                    count3 = Integer.MAX_VALUE;
                }
            }
            
            if(count4 != Integer.MAX_VALUE){
                if(tops[i] == val2){
                    //nothing to do
                } else if(bottoms[i] == val2){
                    count4++;
                } else {
                    count4 = Integer.MAX_VALUE;
                }
            }
        }
        
        int ans = Math.min(Math.min(count1,count2),Math.min(count3,count4));
        
        return ans != Integer.MAX_VALUE ? ans : -1;
    }
}