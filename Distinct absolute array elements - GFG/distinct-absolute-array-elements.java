//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().distinctCount(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    int distinctCount(int[] arr, int n) {
        int count = 0;
        // code here
        int i = 0;
        int j = arr.length-1;
        
        int pre = Integer.MIN_VALUE;
        int next = Integer.MAX_VALUE;
        
        while(i<=j){
            if(Math.abs(arr[i]) == Math.abs(arr[j])){
                 if(pre != arr[i] && next != arr[j]){
                     count++;
                 }
                 
                 pre = arr[i];
                 next = arr[j];
                 i++;
                 j--;
                 
            } else if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                if(next != arr[j]){
                    count++;
                }
                next = arr[j];
                j--;
                
            } else {
                if(pre!=arr[i]){
                    count++;
                }
                pre = arr[i];
                i++;
            }
        }
        
        return count;
    }
}
