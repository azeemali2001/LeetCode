class Solution {
    
    public static boolean isPossible(String word, String pattern) {
        HashMap<Character,Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0;i<word.length();i++){
            char wch = word.charAt(i);
            char pch = pattern.charAt(i);
            
            if(hm.containsKey(pch)) {
                //Already mapped checked if it is mapped with other character or not
                if(hm.get(pch) != wch){
                    return false;
                }               
            } else {
                //character is new we have to mapped it with wch
                //but before that we have to checked it
                if(hs.contains(wch)) {
                    return false;
                }
                
                hm.put(pch,wch);
                hs.add(wch);
            }
        }
        return true;
    }
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        
        for(String word : words){
            if(isPossible(word,pattern)) {
                ans.add(word);
            }
        }
        
        return ans;
    }
}