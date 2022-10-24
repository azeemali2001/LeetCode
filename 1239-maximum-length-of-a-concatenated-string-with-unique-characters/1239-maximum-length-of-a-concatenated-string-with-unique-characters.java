class Solution {
    static int ans;
    public int maxLength(List<String> arr) {
        ans = 0;
        solve(arr,0,"");
        return ans;
    }
    
    public static void solve(List<String> arr, int i, String asf){
        if(i==arr.size()){
            if(isValid(asf)){
                ans = Math.max(asf.length(),ans);
            }
            return;
        }
        
        solve(arr,i+1,asf+arr.get(i));
        solve(arr,i+1,asf);

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