class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {
            
            if(s.charAt(i) == ' ') {
                
                list.add(sb.toString());
                sb = new StringBuilder();
                i++;
            }
            
            sb.append(s.charAt(i));
            
        }
        
        list.add(sb.toString());
        
        sb = new StringBuilder();
        
        
        for(int i=0;i<list.size();i++) {
            String str = list.get(i);
            
            for(int j=str.length()-1;j>=0;j--) {
                sb.append(str.charAt(j));
            }
            
            if(i!=list.size()-1) {
                sb.append(" ");    
            }
            
        }
        
        return sb.toString();
    }
}