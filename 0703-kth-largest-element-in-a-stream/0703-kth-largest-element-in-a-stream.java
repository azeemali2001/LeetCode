class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        
        for(int i=0;i<nums.length;i++){
            if(pq.size() < k){
                pq.add(nums[i]);
            } else {
                if(pq.peek() < nums[i]){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        
    }
    
    public int add(int val) {
        if(pq.size() == 0){
            pq.add(val);
            return val;
        } else if(pq.size() < k){
            pq.add(val);
            return pq.peek();
        } else {
            if(pq.peek() < val){
                pq.remove();
                pq.add(val);
                return pq.peek();
            } else {
                return pq.peek();
            }
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */