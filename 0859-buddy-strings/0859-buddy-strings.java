class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        
        if(s.equals(goal)) {
            Set<Character> hs = new HashSet<>();
            
            for(Character a : s.toCharArray()) {
                hs.add(a);
            }
            
            return hs.size() < s.length();
        }
        
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                list.add(i);
            }
        }
        
        
        if(list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) &&                          s.charAt(list.get(1)) == goal.charAt(list.get(0))) return true;
        
        return false;
    }
}