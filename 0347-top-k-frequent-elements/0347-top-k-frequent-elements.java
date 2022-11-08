class Solution {
    
    class Pair implements Comparable<Pair>{
        int val;
        int count;
        Pair(int val,int count){
            this.val = val;
            this.count = count;
        }
        public int compareTo(Pair o){
            return this.count - o.count;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int val : nums){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        
        for(Integer val : hm.keySet()){
            if(pq.size() < k){
                pq.add(new Pair(val,hm.get(val)));
            } else {
                if(pq.peek().count < hm.get(val)){
                    pq.remove();
                    pq.add(new Pair(val,hm.get(val)));
                }
            }
        }
        int i = 0;
        while(pq.size() != 0){
            ans[i++] = pq.remove().val;
        }
        
        return ans;
    }
}