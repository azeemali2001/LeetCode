//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int n,int m)
    {
        //Your code here
        if(n < m){
            return -1;
        }
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        
        for(int val : arr){
            lo = Math.max(val,lo);
            hi += val;
        }
        
        int ans = 0;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo)/2;
            
            if(isPossible(arr,mid,m) == true){
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        
        return ans;
    }
    
    public static boolean isPossible(int[] arr, int mid, int m){
        int sum = 0;
        int st = 1;
        
        for(int val : arr){
            sum += val;
            if(sum > mid){
                st++;
                sum = val;
            }
        }
        
        return st <= m;
    }
    
    
    
    
    
    
    
    
    
    
    
    
};