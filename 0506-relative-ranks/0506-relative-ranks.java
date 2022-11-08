class Solution {
    
    public class Pair implements Comparable<Pair>{
        int val;
        int idx;
        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        
        public int compareTo(Pair o){
            return this.val - o.val;
        }
    }
    
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<score.length;i++){
            pq.add(new Pair(score[i],i));
        }
        
        
        int i = 0;
        while(pq.size() != 0){
            Pair top = pq.remove();
            int idx = top.idx;
            
            if(i==0){
                ans[idx] = "Gold Medal";
            } else if(i==1){
                ans[idx] = "Silver Medal";
            } else if(i==2){
                ans[idx] = "Bronze Medal";
            }else {
                ans[idx] = i+1+"";
            }
            i++;
        }
        
        return ans;
        
    }
}