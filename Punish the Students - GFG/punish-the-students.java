//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            double avg = sc.nextDouble ();
            int[] roll = new int[n];
            int[] marks = new int[n];
            
            for (int i = 0; i < n; ++i)
                roll[i] = sc.nextInt ();
                
            for (int i = 0; i < n; ++i)
                marks[i] = sc.nextInt ();

    		System.out.println (new Solution().shouldPunish (roll, marks, n, avg));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        // your code here
        int swap = 0;
        
        for(int itr=1;itr<=n-1;itr++){
            for(int i=0;i<n-itr;i++){
                if(roll[i] > roll[i+1]){
                    swap+=2;
                    int temp = roll[i];
                    roll[i] = roll[i+1];
                    roll[i+1] = temp;
                }
            }
        }
        
        int total = 0;
        for(int val : marks){
            total += val;
        }
        
        int nmarks = total - swap;
        double navg = (nmarks*1.0)/n;
        if(navg >= avg){
            return 1;
        }
        
        return 0;
    }
}