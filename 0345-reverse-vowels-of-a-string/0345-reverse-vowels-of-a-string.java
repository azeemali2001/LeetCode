class Solution {
    
    public boolean isVowel(char a) {
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') return true;
        if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') return true;
        
        return false;
    }
    
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        
        char[] arr = s.toCharArray();
        
        while(i < j) {
            while(i < arr.length && !isVowel(arr[i])) i++;
            while(j >= 0 && !isVowel(arr[j])) j--;
            
            if(i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(arr);
    }
}