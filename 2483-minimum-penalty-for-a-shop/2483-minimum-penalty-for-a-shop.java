class Solution {
    public int bestClosingTime(String str) {
        int y = 0;
        int n = 0;
        
        int[] yes = new int[str.length()];
        
        for(int i=str.length()-1;i>=0;i--) {
            if(str.charAt(i) == 'Y') y++;
            yes[i] = y;
        }
        
        
        int ans = Integer.MAX_VALUE;
        int idx = -1;
        
        
        for(int i=0;i<str.length();i++) {
            int count = yes[i] + n;
            
            if(count < ans) {
                ans = count;
                idx = i;
            }
            
            
            if(str.charAt(i) == 'N') n++;
        }
        
        if(n < ans) idx = str.length();
        
        return idx;
    }
}