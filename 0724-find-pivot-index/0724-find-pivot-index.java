class Solution {
    public int pivotIndex(int[] arr) {
        
        int ls = 0;
        int rs = 0;
        for(int i=0;i<arr.length;i++)
        {
            rs+=arr[i];
        }
        
        
        for(int i=0;i<arr.length;i++)
        {
            rs -= arr[i];   
            if(ls == rs)
            {
                return i;
            }
            ls += arr[i];
            
        }
        
        return -1;
    }
}