class Solution {
    
    public static boolean isVowel(char[] arr,int idx){
        char ch = arr[idx];
        if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u' || 
          ch == 'A' || ch == 'E' || ch == 'I'  || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    
    public static void swap(char[] arr,int i,int j){
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }
    
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo < hi){
            while(lo<hi && isVowel(arr,lo) == false){
                lo++;
            }
            
            while(lo<hi && isVowel(arr,hi) == false){
                hi--;
            }
            
            swap(arr,lo,hi);
            lo++;
            hi--;
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            sb.append(ch);
        }
        
        return sb.toString();
    }
}