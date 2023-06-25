//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int nCr(int n, int r)
    {
        int[][] dp = new int[n+1][r+1];
        return solve(n, r, dp);
    }
    
    static int solve(int n, int r, int[][] dp) {
        
        if(n < r) return 0;
        if(r == 0) return 1;
        if(dp[n][r] != 0) return dp[n][r];
        
        return dp[n][r] = (solve(n-1, r-1, dp) + solve(n-1, r, dp)) % 1000000007;
    }
    
    
}