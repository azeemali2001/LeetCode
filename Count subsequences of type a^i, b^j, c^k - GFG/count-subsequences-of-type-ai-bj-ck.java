//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t>0)
		{
		    String s = sc.next();
		    
		    Solution T = new Solution();
		    System.out.println(T.fun(s));
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int fun(String s)
    {
        long a = 0;
        long ab = 0;
        long abc = 0;
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'a') {
                a = (2*a + 1) % 1000000007;
            } else if(s.charAt(i) == 'b') {
                ab = (2*ab + a) % 1000000007;
            } else {
                abc = (2*abc + ab) % 1000000007;
            }
        }
        
        return (int)abc;
    }
}