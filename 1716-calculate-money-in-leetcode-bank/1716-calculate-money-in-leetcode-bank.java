class Solution {
    public int totalMoney(int n) {
        int r = n%7;
        int q = n/7;
        
        
        
        int st = 1;
        int ans = 0;
        
        
        for(int i=0;i<q;i++) {
            int cnt = 0;
            while(cnt != 7) {
                ans += st + cnt;
                cnt ++;
            }
            
            st ++;
        }
        
        
        while(r--> 0) {
            ans += st;
            st ++;
        }
        
        return ans;
    }
}