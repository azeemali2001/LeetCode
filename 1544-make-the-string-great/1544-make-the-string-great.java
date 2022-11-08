class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        int i = 1;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(st.size() != 0 && (st.peek() + 32 == ch || ch+32 == st.peek())){
                st.pop();
            } else {
                st.push(ch);
            }
            i++;
        }

        for(Character a : st){
            sb.append(a);
        }
        return sb.toString();
    }
}