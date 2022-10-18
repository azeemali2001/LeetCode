class Solution {
    
    public static class Pair implements Comparable<Pair>{
        int val;
        int dif;
        Pair(int val,int dif){
            this.val = val;
            this.dif = dif;
        }
        
        public int compareTo(Pair o){
            if(this.dif == o.dif){
                return this.val - o.val;
            } else {
                return this.dif-o.dif;
            }
        }
    }
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            int dif = Math.abs(arr[i]-x);
            if(pq.size() < k){
                pq.add(new Pair(arr[i],dif));
            } else {
                if(pq.peek().dif > dif){
                    pq.remove();
                    pq.add(new Pair(arr[i],dif));
                }
            }
        }
        
        for(Pair p : pq){
            ans.add(p.val);
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}