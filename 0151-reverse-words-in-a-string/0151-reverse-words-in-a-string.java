class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        int j = s.length()-1;
        
        while(j>=0 && s.charAt(j) == ' ') j--;
        i = j;
        
        int st = 0;
        while(st < s.length() && s.charAt(st) == ' ') st ++;
        
        StringBuilder ans = new StringBuilder();
        
        while(i >= 0) {
            
            
            while(j >= 0 && s.charAt(j) != ' ') j--;
            
            if(j<st) {
                ans.append(s.substring(j+1, i+1));
            } else {
                ans.append(s.substring(j+1, i+1) + " ");
            }
            
            
            while(j >= 0 && s.charAt(j) == ' ') j--;
            
            i = j;
            
        }
        
        return ans.toString();
    }
}