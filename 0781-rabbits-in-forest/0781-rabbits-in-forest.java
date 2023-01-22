class Solution {
    public int numRabbits(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int val : nums) {
            hm.put(val, hm.getOrDefault(val,0)+1);
        }
        
        int ans = 0;
        
        for(Integer key : hm.keySet()) {
            int gs = key+1;
            int reportees = hm.get(key);
            
            int ng = (int)Math.ceil(reportees * 1.0 / gs * 1.0);
            
            ans += ng * gs;
        }
        
        return ans;
    }
}