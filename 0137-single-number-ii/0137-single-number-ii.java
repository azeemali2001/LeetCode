class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int val : nums) {
            hm.put(val,hm.getOrDefault(val,0) + 1);
            if(hm.get(val) == 3) {
                hm.remove(val);
            }
        }
        
        
        for(Integer key : hm.keySet()) {
            if(hm.get(key) == 1) {
                return key;
            }
        }
        
        return 0;
    }
}