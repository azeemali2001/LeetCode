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
        
        
        int i = 0;
        while(i < s.length() && s.charAt(i) == goal.charAt(i)) i++;
        
        int j = s.length()-1;
        while(j>=0 && s.charAt(j) == goal.charAt(j)) j--;
        
        char[] arr = s.toCharArray();
        
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        s = new String(arr);
        
        return s.equals(goal);
    }
}