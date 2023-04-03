//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
        long ob = 1;
        long os = 1;
        
        for(int i=2;i<=N;i++) {
            long nb = os%1000000007;
            long ns = (ob+os)%1000000007;
            
            ob = nb;
            os = ns;
        }
        
        long ans =  (ob+os)%1000000007;
        ans = (ans*ans)%1000000007;
        return (int)ans;
    }
}