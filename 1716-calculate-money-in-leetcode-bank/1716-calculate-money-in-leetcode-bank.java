class Solution {
    public int totalMoney(int n) {
        
        int ans = 0;
        
        int week = n/7;
        
        for(int i=0;i<week;i++) {
            ans += (28 + (i * 7));
        }
        
        int remDays = n%7;
        int currWeek = week + 1;
        
        int cnt = 0;
        while(remDays --> 0) {
            ans += currWeek + cnt;
            cnt ++;
        }
        
        return ans;
    }
}