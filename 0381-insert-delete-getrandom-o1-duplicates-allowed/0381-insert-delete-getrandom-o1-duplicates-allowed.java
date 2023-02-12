class RandomizedCollection {
    
    HashMap<Integer,HashSet<Integer>> hm;
    List<Integer> list;
    Random r;

    public RandomizedCollection() {
        hm = new HashMap<>();
        list = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        boolean flag;
        
        if(hm.containsKey(val)) {
            HashSet<Integer> hs = hm.get(val);
            hs.add(list.size());
            flag = false;
        } else {
            HashSet<Integer> hs = new HashSet<>();
            hs.add(list.size());
            hm.put(val,hs);
            flag = true;
        }
        
        list.add(val);
        
        return flag;
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val) == false) {
            return false;
        }
        
        HashSet<Integer> hs = hm.get(val);
        int remIdx = -1;
        for(int i : hs) {
            remIdx = i;
            break;
        }
        
        hs.remove(remIdx);
        hm.put(val,hs);
        if(hs.size() == 0) hm.remove(val);
        
        if(remIdx == list.size()-1) {
            list.remove(list.size()-1);
        } else {
            list.set(remIdx,list.get(list.size()-1));
            list.remove(list.size()-1);
            
            int newVal = list.get(remIdx);
            HashSet<Integer> set = hm.get(newVal);
            set.remove(list.size());
            set.add(remIdx);
            hm.put(newVal,set);
        }
        
        return true;
    }
    
    public int getRandom() {
        int randomIdx = r.nextInt(0,list.size());
        return list.get(randomIdx);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */