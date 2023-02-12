class RandomizedSet {
    
    HashMap<Integer,Integer> hm;
    List<Integer> list;
    Random r;

    public RandomizedSet() {
        hm = new HashMap<>();
        list = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val)) {
            return false;
        }
        
        hm.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val) == false) {
            return false;
        }
        
        int idx = hm.get(val);
        hm.remove(val);
        
        if(idx == list.size()-1) {
            list.remove(list.size()-1);
            return true;
        }
        
        list.set(idx,list.get(list.size()-1));
        list.remove(list.size()-1);
        
        hm.put(list.get(idx),idx);
        return true;
    }
    
    public int getRandom() {
        int randomIdx = r.nextInt(0,list.size());
        return list.get(randomIdx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */