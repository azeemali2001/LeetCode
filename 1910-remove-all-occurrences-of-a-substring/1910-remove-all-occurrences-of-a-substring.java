class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            st.push(ch);
            
            if(st.size() >= part.length() && st.size() != 0 && st.peek() == part.charAt(part.length()-1)){
                int idx = i-1;
                boolean flag = true;
                Stack<Character> temp = new Stack<>();
                for(int j=part.length()-1;j>=0;j--){
                    if(part.charAt(j) == st.peek()){
                        temp.push(st.pop());
                    } else {
                        flag = false;
                        break;
                    }
                }
                
                if(!flag){
                    while(temp.size() != 0){
                        st.push(temp.pop());
                    }
                }
                
            }
            
            
        }
        
        StringBuilder sb = new StringBuilder();
        while(st.size() != 0){
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        return sb.toString();
        
    }
}