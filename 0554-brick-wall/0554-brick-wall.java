class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        
        for(List<Integer> list : wall) {
            int ps = 0;
            
            for(int i=0;i<list.size()-1;i++) {
                int val = list.get(i);
                ps += val;
                
                hm.put(ps,hm.getOrDefault(ps,0)+1);
                max = Math.max(max,hm.get(ps));
            }
        }
        
        
        return wall.size()-max;
    }
}