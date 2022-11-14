class Solution {
public:
    int countGoodStrings(int low, int high, int z, int o) {
        long long dp[high+1][2];
        for(int i=0; i<=high; ++i)
            dp[i][0] = dp[i][1] = 0;        
        long long m = 1e9+7;
        dp[0][0] = 1;
        for(int i=1; i<=high; ++i){
            if(i-z>=0) dp[i][0] = ((dp[i-z][0]%m)+(dp[i-z][1]%m))%m;
            if(i-o>=0) dp[i][1] = ((dp[i-o][0]%m)+(dp[i-o][1]%m))%m;
        }
        long long sum=0;
        for(int i=low; i<=high; ++i) {
            sum+=(dp[i][0]+dp[i][1])%m;
            sum+=m;
            sum%=m;
        }
        return sum;
    }
};