//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        
        boolean[] isprime = new boolean[n+1];
        
        Arrays.fill(isprime,true);
        
        for(int i=2;i*i<=isprime.length;i++){
            if(isprime[i] == true){
                for(int j=i+i;j<isprime.length;j+=i){
                    isprime[j] = false;
                }
            }
        }
        
        for(int i=2;i<isprime.length;i++){
            if(isprime[i] == true){
                ans.add(i);
            }
        }
        
        return ans;
    }
}