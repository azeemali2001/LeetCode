//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        int i = 0;
        
        while(i < arr.length-2) {
            int low = i+1;
            int high = arr.length-1;
            
            while(low < high) {
                int sum = arr[i] + arr[low] + arr[high];
                
                if(sum == 0) {
                    return true;
                }
                
                while(sum <= 0 && arr[low] == arr[++low] && low < high);
                while(sum >= 0 && arr[high] == arr[--high] && low < high);
            }
            
            while(arr[i] == arr[++i] && i < arr.length-2);
        }
        
        return false;

    }
}