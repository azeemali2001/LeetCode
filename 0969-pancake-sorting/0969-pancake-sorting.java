class Solution {
    
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
    
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=arr.length-1;i>=0;i--){
            int maxIdx = i;
            
            for(int j=i-1;j>=0;j--){
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }
            
            if(maxIdx != i){
                reverse(arr,0,maxIdx);
                ans.add(maxIdx+1);
                
                reverse(arr,0,i);
                ans.add(i+1);
            }
        }
        
        return ans;
    }
}