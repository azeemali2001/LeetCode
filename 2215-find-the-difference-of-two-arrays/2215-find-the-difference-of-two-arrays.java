class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int val : nums1) {
            hm1.put(val, hm1.getOrDefault(val, 0) + 1);
        }
        
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int val : nums2) {
            hm2.put(val, hm2.getOrDefault(val, 0) + 1);
        }
        
        
        List<Integer> temp1 = new ArrayList<>();
        
        for(int val : nums1) {
            if(!hm2.containsKey(val)) {
                temp1.add(val);
                hm2.put(val,0);
            }
        }
        
        List<Integer> temp2 = new ArrayList<>();
        
        for(int val : nums2) {
            if(!hm1.containsKey(val)) {
                temp2.add(val);
                hm1.put(val,0);
            }
        }
        
        ans.add(temp1);
        ans.add(temp2);
        
        return ans;
    }
}