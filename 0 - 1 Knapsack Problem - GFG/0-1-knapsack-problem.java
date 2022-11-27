//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    static int[][] t = new int[1001][1001];
    
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int w, int wt[], int val[], int n) 
    {
        for(int[] arr : t){
            Arrays.fill(arr,-1);
        }
        
        return knapsack(w,wt,val,n);
    }
    
    static int knapsack(int w, int wt[], int val[], int n) 
    {
        if(w == 0 || n == 0) return 0;
        
        if(t[n][w] != -1) return t[n][w];    
        
        if(wt[n-1] <= w) {
            return t[n][w] = Math.max(val[n-1] + knapsack(w-wt[n-1],wt,val,n-1), knapsack(w,wt,val,n-1));
        } else {
            return t[n][w] = knapsack(w,wt,val,n-1);
        }
    }
}


