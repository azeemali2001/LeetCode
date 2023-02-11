class FreqStack {

    HashMap<Integer,LinkedList<Integer>> st;
    HashMap<Integer,Integer> hm;
    int maxfre;
    
    public FreqStack() {
        st = new HashMap<>();
        hm = new HashMap<>();
        maxfre = 0;
    }
    
    public void push(int val) {
        //Updating Frequency Map
        if(hm.containsKey(val) == true) {
            hm.put(val,hm.get(val)+1);
        } else {
            hm.put(val,1);
        }
        
        int eleFre = hm.get(val);
        
        
        //Updating Stack Map
        if(st.containsKey(eleFre) == true) {
            LinkedList<Integer> list = st.get(eleFre);
            list.addFirst(val);
        } else {
            LinkedList<Integer> list = new LinkedList<>();
            list.addFirst(val);
            st.put(eleFre,list);
        }
        
        maxfre = Math.max(maxfre,eleFre);
        
    }
    
    public int pop() {
        int ans = st.get(maxfre).removeFirst();
        
        int cfre = hm.get(ans);
        if(cfre == 1) {
            hm.remove(ans);
        } else {
            hm.put(ans,cfre-1);
        }
        
        if(st.get(maxfre).size() == 0) {
            st.remove(maxfre);
            maxfre --;
        }
        
        
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */