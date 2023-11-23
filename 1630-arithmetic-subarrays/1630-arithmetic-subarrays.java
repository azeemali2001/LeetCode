class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        
        for(int i=0;i<l.length;i++) {
            ans.add(check(nums, l[i], r[i]));
        }
        
        
        return ans;
    }
    
    
    
    private boolean check(int[] arr, int l, int h) {
        
        if(l-h == 1) return false;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=l;i<=h;i++) {
            pq.add(arr[i]);
        }
        
        int val1 = pq.remove();
        int val2 = pq.remove();
        
        int dif = val2 - val1;
        
        while(pq.size() != 0) {
            int val = pq.remove();
            
            if(val-val2 != dif) {
                return false;
            }
            
            val2 = val;
        }
        
        return true;
    }
}