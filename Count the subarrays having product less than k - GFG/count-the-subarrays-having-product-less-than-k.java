//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public int countSubArrayProductLessThanK(long arr[], int n, long k)
    {
        int i = 0;
        int j = 0;
        
        int ans = 0;
        long pro = 1;
        
        while(j < n) {
            pro *= arr[j];
            
            if(pro < k) {
                ans += j-i+1;
            } else {
                while(i <= j && pro >= k) {
                    pro /= arr[i];
                    i++;
                }
                
                
                // if(i > j) j = i;
                if(pro < k) ans += Math.max(0,j-i+1);
            }
            j++;
        }
        
        return ans;
    }
}