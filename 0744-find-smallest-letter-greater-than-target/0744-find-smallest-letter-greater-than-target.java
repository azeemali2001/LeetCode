class Solution {
    
    public static boolean binarySearch(char[] arr, int i, int j, char target){
        while(i<=j){
            int mid = (i+j)/2;
            
            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] > target) {
                j= mid-1;
            } else if(arr[mid] < target) {
                i = mid+1;
            }
        }
        
        return false;
    }
    
    public char nextGreatestLetter(char[] letters, char target) {
        int st = target+1;
        char al = (char)st;
        for(char ch = al;ch<='z';ch++){
            if(binarySearch(letters,0,letters.length-1,ch)){
                return ch;
            }
        }
        
        return letters[0];
    }
}