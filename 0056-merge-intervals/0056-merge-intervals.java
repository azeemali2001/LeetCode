class Solution {
    
    public static class Pair implements Comparable<Pair> {
        int sp;
        int ep;
        
        Pair(int sp,int ep){
            this.sp = sp;
            this.ep = ep;
        }
        
        public int compareTo(Pair o){
            return this.sp-o.sp;
        }
    }
    
    public int[][] merge(int[][] intervals) {
        Pair[] arr = new Pair[intervals.length];
        
        int idx = 0;
        for(int[] interval : intervals){
            arr[idx++] = new Pair(interval[0],interval[1]);
        }
        
        Arrays.sort(arr);
        
        ArrayList<Pair> ans = new ArrayList<>();
        ans.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            
            int sp1 = ans.get(ans.size()-1).sp;
            int ep1 = ans.get(ans.size()-1).ep;
            
            int sp2 = arr[i].sp;
            int ep2 = arr[i].ep;
            
            if(ep1 >= sp2){
                //Merge
                ans.get(ans.size()-1).ep = Math.max(ep1,ep2);
            } else {
                //No merge add new Pair
                ans.add(new Pair(sp2,ep2));
            }
        }
        
        int[][] res = new int[ans.size()][2];
        
        for(int i=0;i<ans.size();i++){
            res[i][0] = ans.get(i).sp;
            res[i][1] = ans.get(i).ep;
        }
        
        return res;
    }
}