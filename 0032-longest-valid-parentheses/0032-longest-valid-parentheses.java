class Solution {
    static class Pair {
        int pos;
        char ch;
        
        Pair(int pos, char ch){
            this.pos = pos;
            this.ch = ch;
        }
    }
    
    
    public int longestValidParentheses(String s) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Pair> st = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') {
                st.push(new Pair(i,'('));
            } else if(ch == ')') {
                if(st.size() != 0 && st.peek().ch == '(') {
                    hm.put(st.peek().pos, i);
                    st.pop();
                }
            }
        }
        int ans = 0;
        
        
        int i = 0;
        int si = 0;
        int count = 0;
        while(i<s.length()) {
            
            if(hm.containsKey(si)) {
                count += hm.get(si) - si + 1;
                si = hm.get(si);
                si++;
            } else {
                i++;
                si++;
                count = 0;
            }
            ans = Math.max(ans,count);
        }
        
        
        
        return ans;
    }
}