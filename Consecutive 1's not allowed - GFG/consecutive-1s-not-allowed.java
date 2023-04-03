//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        // code here
        long oldCount0 = 1;
        long oldCount1 = 1;
        
        for(int i=2;i<=n;i++) {
            long newCount0 = (oldCount0 + oldCount1) % 1000000007;
            long newCount1 = oldCount0 % 1000000007;
            
            
            
            oldCount0 = newCount0;
            oldCount1 = newCount1;
        }
        
        return (oldCount0 + oldCount1)% 1000000007;
    }
}