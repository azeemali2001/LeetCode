class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '*' && st.size() != 0) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        while(st.size() != 0) {
            sb.append(st.pop());
        }
        sb.reverse();
        
        
        return sb.toString();
    }
}