class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        //HashMap for maintain character with its last occurence
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,i);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        int max = 0;
        int pre = -1;
        //make partition
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(max < hm.get(ch)){
                max = hm.get(ch);
            } else if(max > hm.get(ch)){
                //No need to do anything
            }
            
            if(max == i){
                ans.add(max-pre);
                pre = max;
            }
        }
        
        return ans;
        
    }
}