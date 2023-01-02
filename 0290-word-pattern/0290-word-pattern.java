class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();
        
        
        String[] arr = s.split(" ");
        char[] arr2 = pattern.toCharArray();
        
        if(arr.length != arr2.length) return false;
        
        
        for(int i=0;i<arr.length;i++) {
            if(hm.containsKey(arr2[i])) {
                if(!hm.get(arr2[i]).equals(arr[i])) {
                    return false;
                } else {
                    
                }
            } else {
                if(hm2.containsKey(arr[i])) {
                    if(!hm2.get(arr[i]).equals(arr2[i])) {
                       return false;
                    }
                } else {
                    hm.put(arr2[i],arr[i]);
                    hm2.put(arr[i],arr2[i]);
                }
            }
        }
        
        return true;
    }
}