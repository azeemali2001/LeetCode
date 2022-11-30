class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int val : arr) {
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(Integer key : hm.keySet()) {
            int fre = hm.get(key);
            if(hs.contains(fre)) {
                return false;
            }
            hs.add(fre);
        }
        
        return true;
    }
}