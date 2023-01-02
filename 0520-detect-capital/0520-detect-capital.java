class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        
        boolean isFirstCapital = false;
        if(word.charAt(0) >= 'A' && word.charAt(0) <='Z') isFirstCapital = true;
        
        int count = 0;
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i) >= 'A' && word.charAt(i) <='Z') count++;
        }   
        
        if(count == word.length() || count == 0  || (isFirstCapital && count == 1)) return true;
        return false;
    }
}