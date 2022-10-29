class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> ans = new ArrayList<>();
        
        int i=0;
        int j=0;
        
        while(i<firstList.length && j<secondList.length){
            int sp1 = firstList[i][0];
            int ep1 = firstList[i][1];
            
            int sp2 = secondList[j][0];
            int ep2 = secondList[j][1];
            
            if(ep1 >= sp2 && sp1 <= ep2){
                int[] tmp = {Math.max(sp1,sp2),Math.min(ep1,ep2)};
                ans.add(tmp);
            }
            
            if(ep1 < ep2){
                i++;
            } else {
                j++;
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}