//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        
        int ans = 0;
        
        for(int k=arr.length-1;k>1;k--){
            int i = 0;
            int j = k-1;
            
            while(i<j){
                if(arr[i] + arr[j] == arr[k]){
                    ans++;
                    i++;
                    j--;
                } else if(arr[i] + arr[j] > arr[k]){
                    j--;
                } else {
                    i++;
                }
            }
        }
        
        return ans;
    }
}