class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<HashMap<Character,Integer>,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            
            if(map.containsKey(hm)){
                List<String> list = map.get(hm);
                list.add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(hm,list);
            }
        }
        
        for(HashMap<Character,Integer> key : map.keySet()){
            ans.add(map.get(key));
        }
        
        return ans;
    }
}