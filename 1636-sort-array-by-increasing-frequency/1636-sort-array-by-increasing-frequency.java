class Solution {
    
    public static class Pair implements Comparable<Pair> {
        int val;
        int count;
        
        Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
        
        public int compareTo(Pair o) {
            if(this.count == o.count) {
                return o.val - this.val;
            }
            
            return this.count - o.count;
        }
    }
    
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int val : nums) {
            hm.put(val, hm.getOrDefault(val,0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(Integer key : hm.keySet()) {
            pq.add(new Pair(key,hm.get(key)));
        }
        
        int [] ans = new int[nums.length];
        int a = 0;
        while(pq.size() != 0) {
            Pair rem = pq.remove();
            int counter = rem.count;
            while(counter != 0) {
                ans[a++] = rem.val;
                counter--;
            }
        }
        return ans;
    }
}