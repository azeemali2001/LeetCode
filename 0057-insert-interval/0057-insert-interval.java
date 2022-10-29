class Solution {
    
    public static int[][] mergeIntervals(int[][] arr){
        Arrays.sort(arr,(a,b)->{
           return a[0]-b[0]; 
        });
        
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            int sp1 = ans.get(ans.size()-1)[0];
            int ep1 = ans.get(ans.size()-1)[1];
            
            int sp2 = arr[i][0];
            int ep2 = arr[i][1];
            
            if(ep1 >= sp2){
                //Merge
                ans.get(ans.size()-1)[1] = Math.max(ep1,ep2);
            } else {
                //No Merge
                ans.add(arr[i]);
            }
        }
        int[][] res = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        
        return res;
    }
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = new int[intervals.length+1][2];
        
        for(int i=0;i<intervals.length;i++){
            arr[i][0] = intervals[i][0];
            arr[i][1] = intervals[i][1];
        }
        
        arr[arr.length-1][0] = newInterval[0];
        arr[arr.length-1][1] = newInterval[1];
        
        
        int[][] ans = mergeIntervals(arr);
        return ans;
    }
}