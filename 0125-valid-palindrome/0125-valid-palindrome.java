class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                sb.append((char)(ch+32));
            } else if(ch >= 97 && ch <= 122){
                sb.append((char)(ch));
            } else if(ch >= 48 && ch <=57){
                sb.append((char)(ch));
            }
        }
        
        
        int i = 0;
        int j = sb.length()-1;
        
        while(i<j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}