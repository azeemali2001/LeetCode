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
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public static int[] Lis(int[] arr){
        int[] dp = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            int maxLen = 0;
            
            for(int j=0;j<i;j++){
                if(arr[j] < arr[i]){
                    maxLen = Math.max(maxLen,dp[j]);
                }
            }
            
            maxLen ++;
            dp[i] = maxLen;
        }
        
        return dp;
    }
    
    public static int[] RevLis(int[] arr){
        int[] dp = new int[arr.length];
        
        for(int i=arr.length-1;i>=0;i--){
            int maxLen = 0;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    maxLen = Math.max(maxLen,dp[j]);
                }
            }
            
            dp[i] = maxLen+1;
        }
        
        return dp;
    }
    
    public int LongestBitonicSequence(int[] nums)
    {
        int[] lis = Lis(nums);
        int[] revlis = RevLis(nums);
        
        int ans = 0;
        
        for(int i=0;i<nums.length;i++){
            ans = Math.max(ans,lis[i]+revlis[i]-1);
        }
        
        
        return ans;
    }
}