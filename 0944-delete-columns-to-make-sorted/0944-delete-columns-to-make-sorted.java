class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int count = 0;
        
        for(int i=0;i<n;i++) {
            boolean isvalid = isValid(strs,i);
            if(!isvalid) {
                count ++;
            }
        }
        
        return count;
    }
    
    public static boolean isValid(String[] strs,int idx) {
        int pre = (int)strs[0].charAt(idx);
        for(int i=1;i<strs.length;i++) {
            char ch = strs[i].charAt(idx);
            int now = (int)ch;
            if(now < pre) {
                return false; 
            } else {
                pre = now;
            }
        }
        
        return true;
    }
}