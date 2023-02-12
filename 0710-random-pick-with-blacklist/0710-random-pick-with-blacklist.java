class Solution {
    
    
    HashMap<Integer,Integer> hm;
    int top;
    Random r;
    
    
    public Solution(int n, int[] blacklist) {
        hm = new HashMap<>();
        top = n-blacklist.length;
        r = new Random();
        
        HashSet<Integer> hs = new HashSet<>();
        for(int val : blacklist) {
            hs.add(val);
        }
        
        n--;
        
         for(int i=0;i<blacklist.length;i++) {
             if(blacklist[i] < top) {
                 while(hs.contains(n) == true) {
                     n--;
                 }
                 hm.put(blacklist[i],n);
                 n--;
             }
         }
    }
    
    public int pick() {
        int idx = r.nextInt(0,top);
        if(hm.containsKey(idx) == true) {
            return hm.get(idx);
        } else {
            return idx;
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */