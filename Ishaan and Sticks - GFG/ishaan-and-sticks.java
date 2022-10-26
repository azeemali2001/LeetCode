//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.square(arr, sizeOfArray);
		    for(int i: ans)
		        System.out.print(i + " ");
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> square (int arr[], int n) {
        //Complete the function
        HashMap<Integer,Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        
        int area = -1;
        int count = 0;
        
        for(int i=min;i<=max;i++){
            if(!hm.containsKey(i)) continue;
            
            if(hm.get(i) >= 4){
                int narea = i * i;
                if(narea > area){
                    area = narea;
                    count = hm.get(i)/4;
                }
            }
        }  
        
        if(area == -1){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(area);
        ans.add(count);
        return ans;
    }
}


