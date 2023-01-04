class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int val : tasks) {
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        
        int count = 0;
        
        for(Integer key : hm.keySet()) {
            int val = hm.get(key);
            if(val == 1) return -1;
            
            count += val/3;
            
            if(val%3!=0)count++;
        }
        return count;
    }
}