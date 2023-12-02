class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<chars.length();i++) {
            char ch = chars.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int ans = 0;
        
        for(int i=0;i<words.length;i++) {
            String str = words[i];
            boolean flag = true;
            
            HashMap<Character,Integer> hm = new HashMap<>(map);
            
            for(int j=0;j<str.length();j++) {
                if(hm.containsKey(str.charAt(j))) {
                    if(hm.get(str.charAt(j)) == 1) {
                        hm.remove(str.charAt(j));
                    } else {
                        hm.put(str.charAt(j), hm.get(str.charAt(j))-1);
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            
            if(flag) {
                ans += str.length();
            }
        }
        
        return ans;
    }
}