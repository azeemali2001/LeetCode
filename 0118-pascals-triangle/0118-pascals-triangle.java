class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        
        
        
        for(int i=2;i<=numRows;i++) {
            List<Integer> list = new ArrayList<>();
            
            List<Integer> preList = ans.get(ans.size()-1);
            int idx = 0;
            
            for(int j=1;j<=i;j++) {
                if(j == 1) {
                    list.add(1);
                } else if(j == i) {
                    list.add(1);
                } else {
                    int val = preList.get(idx) + preList.get(idx+1);
                    idx ++;
                    list.add(val);
                }
            }
            
            ans.add(list);
            
        }
        
        
        return ans;
    }
}