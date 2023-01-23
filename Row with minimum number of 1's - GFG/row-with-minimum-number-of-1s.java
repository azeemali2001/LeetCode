//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.minRow(N, M, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minRow(int N, int M, int arr[][]) {
        for (int i = 0; i < arr.length; i++)
            Arrays.sort(arr[i]);
        
        int max = Integer.MAX_VALUE;
        int ans = 0;
        
        for(int i=0;i<arr.length;i++) {
            
            int lo = 0;
            int hi = arr[0].length-1;
            int pos = -1;
            
            while(lo <= hi) {
                int mid = (lo+hi)/2;
                if(arr[i][mid] == 1) {
                    pos = mid;
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            }
            int len = arr[0].length-pos;
            if(pos == -1) len = 0;
            if(len < max) {
                max = len;
                ans = i+1;
            }
        }
        return ans;
    }
};