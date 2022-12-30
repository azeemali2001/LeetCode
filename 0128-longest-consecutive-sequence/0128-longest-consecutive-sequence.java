class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap<>();
        int ans = 0;
        
        // Mark all the element as true i.e each number can start a sequence by its own
        for(int val : nums) {
            hm.put(val,true);
        }
        
        
        // Umark all the element for which their is n-1 element is also present
        for(Integer key : hm.keySet()) {
            if(hm.containsKey(key-1)) {
                hm.put(key,false);
            }
        }
        
        // Now find the length upto which potential number can make the sequence
        for(Integer key : hm.keySet()) {
            if(hm.get(key) == true) {
                int tc = 1;
                int i=1;
                while(hm.containsKey(key+i)) {
                    tc++;
                    i++;
                }
                
                if(tc > ans) {
                    ans = tc;
                }
            }
        }
        return ans;
    }
}