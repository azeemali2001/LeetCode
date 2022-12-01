class Solution {
    
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
           ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        
        return false;
    }
    
    public boolean halvesAreAlike(String s) {
        char[] arr = s.toCharArray();
        int mid = arr.length/2;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<mid;i++) {
            char ch = arr[i];
            if(isVowel(ch)) {
                count1++;
            }
        }
        
        
        for(int i=mid;i<arr.length;i++) {
            char ch = arr[i];
            if(isVowel(ch)) {
                count2++;
            }
        }
        
        
        return count1 == count2;
    }
}