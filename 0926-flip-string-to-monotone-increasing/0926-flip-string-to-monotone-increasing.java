class Solution {
    public int minFlipsMonoIncr(String s) {
        int zero = 0;
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '0') zero++;
        }
        
        int ans = zero;
        int one = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '1') {
                one++;
            } else {
                zero--;
            }
            
            ans = Math.min(ans,one+zero);
        }
        
        return ans;
    }
}