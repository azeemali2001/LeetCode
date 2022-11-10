class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.size() != 0 && st.peek() == ch){
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char a : st){
            sb.append(a);
        }
        return sb.toString();
    }
}