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

class Solution {
    public int LongestBitonicSequence(int[] nums) {
        
        int n = nums.length;
        
        int[] lis = new int[n];
        
        for(int i=0;i<n;i++) {
            
            int max = 0;
            for(int j=0;j<i;j++) {
                if(nums[j] < nums[i]) {
                    if(lis[j] > max) {
                        max = lis[j];
                    }
                }
            }
            
            lis[i] = max + 1;
        }
        
        
        int[] lds = new int[n];
        
        for(int i=nums.length-1;i>=0;i--) {
            int max = 0;
            
            for(int j=nums.length-1;j>i;j--) {
                if(nums[j] < nums[i]) {
                    if(lds[j] > max) {
                        max = lds[j];
                    }
                }
            }
            
            lds[i] = max + 1;
        }
        
        int ans = 0;
        
        
        for(int i=0;i<n;i++) {
            if(lis[i] + lds[i] - 1 > ans) {
                ans = lis[i] + lds[i] - 1;
            }
        }
        
        return ans;
    }
}