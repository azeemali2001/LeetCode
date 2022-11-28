class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0;i<matches.length;i++) {
            int loser = matches[i][1];
            hm.put(loser,hm.getOrDefault(loser,0)+1);
            hs.add(matches[i][0]);
            hs.add(matches[i][1]);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> onlyOne = new ArrayList<>();
        
        for(Integer key : hm.keySet()) {
            if(hm.get(key) == 1) {
                onlyOne.add(key);
            }
        }
        
        
        List<Integer> notLost = new ArrayList<>();
        
        for(Integer key : hs) {
            if(! hm.containsKey(key)) {
                notLost.add(key);
            }
        }
        Collections.sort(onlyOne);
        Collections.sort(notLost);
        
        ans.add(notLost);
        ans.add(onlyOne);
        return ans;
    }
}