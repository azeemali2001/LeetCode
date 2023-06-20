class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++) {
            String str = Integer.toString(n, i);
            if(palindrome(str) == false) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean palindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}