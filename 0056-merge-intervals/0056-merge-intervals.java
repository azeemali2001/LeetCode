class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        
        ArrayList<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            int sp1 = list.get(list.size()-1)[0];
            int ep1 = list.get(list.size()-1)[1];
            
            int sp2 = intervals[i][0];
            int ep2 = intervals[i][1];
            
            if(ep1 >= sp2){
                // Merging
                list.get(list.size()-1)[1] = Math.max(ep1,ep2);
            } else {
                //No merging
                int[] tmp = new int[2];
                tmp[0] = sp2;
                tmp[1] = ep2;
                list.add(tmp);
            }
        }
        
        int[][] ans = list.toArray(new int[list.size()][2]);
        return ans;
    }
}