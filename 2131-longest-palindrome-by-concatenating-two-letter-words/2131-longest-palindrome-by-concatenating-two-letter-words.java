class Solution {
    public int longestPalindrome(String[] words) {
        int[][] arr = new int[26][26];
        int count = 0;
        for(String str : words){
            int a = str.charAt(0)-'a';
            int b = str.charAt(1)-'a';
            
            if(arr[b][a] > 0){
                count+=4;
                arr[b][a]--;
            } else {
                arr[a][b] ++;
            }
        }
        
        for(int i=0;i<26;i++){
            if(arr[i][i] > 0){
                count+=2;
                break;
            }
        }
        
        return count;
    }
}