class Solution {
    public int maxLength(List<String> arr) {
        return solve(arr,0,"");
    }
    
    public static int solve(List<String> arr, int i, String asf){
        if(i==arr.size()){
            if(isValid(asf)){
                return asf.length();
            }
            return 0;
        }
        
        int left = solve(arr,i+1,asf+arr.get(i));
        int right = solve(arr,i+1,asf);
        
        return Math.max(left,right);
    }
    
    public static boolean isValid(String str){
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            arr[ch-'a']++;
            
            if(arr[ch-'a'] > 1){
                return false;
            }
        }
        
        return true;
    }
}