class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        int idx1 = 0;
        int idx2 = 1;
        
        boolean flag = false;
        
        for(int i=0;i<s.length();i++) {
            
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
            if(s.charAt(i) != goal.charAt(i)) {
                if(flag) {
                    idx2 = i;
                    break;
                } else {
                    idx1 = i;
                    flag = true;
                }
            }
        }
        
        if(flag == false)  {
            if(s.length() < 2) return false;
            
            for(Character key : hm.keySet()) {
                if(hm.get(key) > 1) {
                    return true;
                } 
            }
            
            return false;
            
        }
        
        char[] arr = s.toCharArray();
        
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        
        s = new String(arr);
        
        if(s.equals(goal)) {
                return true;
            } else {
                return false;
            }
    }
}