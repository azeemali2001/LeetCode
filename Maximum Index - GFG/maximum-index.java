//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        int maxDiff = Integer.MIN_VALUE;
        
        
        int[] RMax = new int[n];
        int[] LMin = new int[n];
        
        LMin[0] = arr[0];
        RMax[n-1] = arr[n-1];
        
        for(int i=1;i<n;i++) {
            LMin[i] = Math.min(LMin[i-1], arr[i]);
        }
        
        for(int i=n-2;i>=0;i--) {
            RMax[i] = Math.max(RMax[i+1], arr[i]);
        }
        
        
        int i = 0;
        int j = 0;
        
        while(i < n && j < n) {
            if(LMin[i] <= RMax[j]) {
                int diff = j-i;
                maxDiff = Math.max(maxDiff, diff);
                j ++;
            } else {
                i++;
            }
        }
        
        return maxDiff;
    }
}